package th.co.truecorp.esd.grapghql.resolver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;


import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;


@Component
public class CreateCustomerResolver implements DataFetcher<Customer>{
	
	private static final Logger logger = LoggerFactory.getLogger(CreateCustomerResolver.class);

	@Autowired
    private CustomerRepository customerRepository;
	
	@Autowired
	private  ObjectMapper objectMapper = null;
	
	@Override
	public Customer get(DataFetchingEnvironment environment) {
		Object  rawInput = environment.getArgument("customer");	
		Customer customer = objectMapper.convertValue(rawInput, Customer.class);
		System.out.println("customer:"+customer.getCustomerId());
		//return customer;
		return customerRepository.save(customer);
	}

}