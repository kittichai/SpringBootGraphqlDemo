package th.co.truecorp.esd.grapghql.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.truecorp.esd.grapghql.models.Subscriber;


@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, Long>  {
	    //Customer findOne(Long id);
	    //List<Customer> findAll();
	    //getSubscriberNo > findBySubscriberNo > findBy+SubscriberNo
	    List<Subscriber> findBySubscriberNo(int subscriberId);
	    //List<Subscriber> findByOperatorId(int operatorid);
	    //Customer save(Customer item);
	    //void delete(Long id);
	    
}

