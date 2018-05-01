package th.co.truecorp.esd.grapghql.resolver;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.models.filter.CustomerFilter;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;

@Component
public class searchCustomerResolver implements DataFetcher<List<Customer>>{

	@Autowired
    private CustomerRepository customerRepository;
	
	@Autowired
	private  ObjectMapper objectMapper = null;
	
	@Override
	public List<Customer> get(DataFetchingEnvironment environment) {
		//LinkedHashMap link = environment.getArgument("filter");	
		Object  rawInput = environment.getArgument("filter");	
		CustomerFilter customerinput = objectMapper.convertValue(rawInput, CustomerFilter.class);
		
		if (customerinput != null && customerinput.getCustomerId() != 0) {
			  int customer_id = customerinput.getCustomerId();
			  return customerRepository.findByCustomerId(customer_id);
	    }else if(customerinput != null && customerinput.getOperatorId() != 0) {
			  int oper_id = (Integer) customerinput.getOperatorId();
			  return customerRepository.findByOperatorId(oper_id);
	    }else if(customerinput != null 
	    		&& !customerinput.getCertification().equals("") 
	    		&& !customerinput.getCustomerType().equals("") ) {
	    	  String certification = customerinput.getCertification();
			  String customerType = customerinput.getCustomerType();
			  return customerRepository.findByCustomerTypeAndL9Identification(customerType,certification);
	    }else {
	    	//return customerRepository.fin
	    	return null;
	    }
	}

}
