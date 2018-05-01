package th.co.truecorp.esd.grapghql.resolver;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;


@Component
public class CustomerResolver implements DataFetcher<List<Customer>>{

	@Autowired
    private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> get(DataFetchingEnvironment environment) {
		int customerId = environment.getArgument("customerId");
		return customerRepository.findByCustomerId(customerId);
	}

}
*/