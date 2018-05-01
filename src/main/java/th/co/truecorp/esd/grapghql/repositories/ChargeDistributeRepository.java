package th.co.truecorp.esd.grapghql.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.truecorp.esd.grapghql.models.ChargeDistribute;


@Repository
public interface ChargeDistributeRepository extends CrudRepository<ChargeDistribute, Long>  {
	List<ChargeDistribute> findByTrxId(String id);
}
