package th.co.truecorp.esd.grapghql.services;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import graphql.GraphQL;
import graphql.Scalars;
import graphql.schema.DataFetcher;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import th.co.truecorp.esd.grapghql.resolver.CreateCustomerResolver;
import th.co.truecorp.esd.grapghql.resolver.FindByChargeDistibuteIdResolver;
import th.co.truecorp.esd.grapghql.resolver.FindByCustomerIdResolver;
import th.co.truecorp.esd.grapghql.resolver.FindByOperatorIdResolver;
import th.co.truecorp.esd.grapghql.resolver.FindBySubscriberIdResolver;
import th.co.truecorp.esd.grapghql.resolver.UpdateCustomerResolver;
import th.co.truecorp.esd.grapghql.resolver.searchCustomerResolver;

@Service
public class GraphQLService {

	@Value("classpath:graphql/schema.graphql")
	Resource schemaResource;

	@Autowired
	private searchCustomerResolver searchcustomerResolver;
	
	@Autowired
	private FindByCustomerIdResolver customerResolver;
	@Autowired
	private FindByOperatorIdResolver operatorResolver;
	
	@Autowired
	private FindBySubscriberIdResolver findBySubscriberId;
	
	@Autowired
	private FindByChargeDistibuteIdResolver chargeDistibuteIdResolver;
	//FindBySubscriberIdResolver
	
	@Autowired
	private CreateCustomerResolver createCustomerResolver;
	
	@Autowired
	private UpdateCustomerResolver updateCustomerResolver;
	////
	private GraphQL graphQL;
	private GraphQLSchema graphQLSchema;

	@PostConstruct
	public void loadGraphQLSchema() throws IOException {
		File schema = schemaResource.getFile();
		TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schema);
		RuntimeWiring runtimeWiring = initWiring();
		graphQLSchema = new SchemaGenerator().makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);
		graphQL = GraphQL.newGraphQL(graphQLSchema).build();
	}

	private RuntimeWiring initWiring() {
		return RuntimeWiring.newRuntimeWiring()
				.type("Mutation", typeWiring -> typeWiring.dataFetchers(setdataFunctionFetcher()))
				.type("Query", typeWiring -> typeWiring.dataFetchers(getdataFunctionFetcher()))		
				.build();
	}

	private Map<String, DataFetcher> getdataFunctionFetcher() {
		Map<String, DataFetcher> dataFetcherMap = new HashMap<String, DataFetcher>();

		dataFetcherMap.put("findByCustomerid", customerResolver);
		dataFetcherMap.put("findByOperatorid", operatorResolver);
		dataFetcherMap.put("findBySubscriberId", findBySubscriberId);
		
		dataFetcherMap.put("findChargeDistributeByTrackingId", chargeDistibuteIdResolver);		
		dataFetcherMap.put("findCsmAccountById", chargeDistibuteIdResolver);
		
		dataFetcherMap.put("searchCustomer", searchcustomerResolver);
		
		return dataFetcherMap;
	}
	
	private Map<String, DataFetcher> setdataFunctionFetcher() {
		Map<String, DataFetcher> dataFetcherMap = new HashMap<String, DataFetcher>();
		dataFetcherMap.put("createCustomer", createCustomerResolver);
		dataFetcherMap.put("updateCustomer", updateCustomerResolver);
		return dataFetcherMap;
	}


	public GraphQL getGraphQL() {
		return graphQL;
	}

	@Bean
	public GraphQLSchema getGraphQLSchema() {
		return graphQLSchema;
	}

	// @Bean
	GraphQLSchema schema() {
		return GraphQLSchema.newSchema().query(GraphQLObjectType.newObject().name("query").field(
				field -> field.name("test").type(Scalars.GraphQLString).dataFetcher(environment -> "Hello GraphQL"))
				.build()).build();
	}

}
