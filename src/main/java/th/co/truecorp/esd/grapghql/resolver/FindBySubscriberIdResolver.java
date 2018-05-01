package th.co.truecorp.esd.grapghql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.Subscriber;
import th.co.truecorp.esd.grapghql.repositories.SubscriberRepository;

//findBySubscriberId
@Component
public class FindBySubscriberIdResolver implements DataFetcher<List<Subscriber>>{

	@Autowired
    private SubscriberRepository subscriberRepository;

	
	@Override
	public List<Subscriber> get(DataFetchingEnvironment environment) {
		Integer subscriber_id = Integer.parseInt( environment.getArgument("subscriber_id") );
		
		
        return subscriberRepository.findBySubscriberNo(subscriber_id);
	}

}
