package th.co.truecorp.esd.grapghql.services;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import graphql.servlet.SimpleGraphQLServlet;
import th.co.truecorp.esd.grapghql.resolver.FindByCustomerIdResolver;

//@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

	@Value("classpath:graphql/schema.graphql")
	static Resource schemaResource;

	@Autowired
	private static FindByCustomerIdResolver customerResolver;

	public GraphQLEndpoint() throws IOException {
		super(buildSchema());
	}

	private static GraphQLSchema buildSchema() throws IOException {
		File schema = schemaResource.getFile();
		TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schema);
		RuntimeWiring runtimeWiring = initWiring();
		GraphQLSchema graphQLSchema = new SchemaGenerator().makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);
		return graphQLSchema;
	}

	private static RuntimeWiring initWiring() {
		return RuntimeWiring.newRuntimeWiring()
				.type("Query", typeWiring -> typeWiring.dataFetcher("Customer", customerResolver)).build();
	}

}
