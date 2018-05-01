package th.co.truecorp.esd.grapghql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.ChargeDistribute;
import th.co.truecorp.esd.grapghql.repositories.ChargeDistributeRepository;

@Component
public class FindByChargeDistibuteIdResolver implements DataFetcher<List<ChargeDistribute>>{

	@Autowired
    private ChargeDistributeRepository chargeDistributeRepo;
	
	@Override
	public List<ChargeDistribute> get(DataFetchingEnvironment environment) {
		String id = environment.getArgument("id");
		return chargeDistributeRepo.findByTrxId(id);
	}

}
