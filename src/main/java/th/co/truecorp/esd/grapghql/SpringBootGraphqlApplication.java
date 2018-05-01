package th.co.truecorp.esd.grapghql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import graphql.Scalars;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;

@SpringBootApplication
public class SpringBootGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGraphqlApplication.class, args);
		
		
		
	}
}
