package th.co.truecorp.esd.grapghql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;

@Controller
public class CustomerController {
	
	@Autowired
    private CustomerRepository customerRepository;

	@GetMapping("/customer/{id}")
	ResponseEntity<List<Customer>> getCustomer(@PathVariable("id") int id) {
        return new ResponseEntity<List<Customer>>(customerRepository.findByCustomerId(id), HttpStatus.OK);
    }
}
