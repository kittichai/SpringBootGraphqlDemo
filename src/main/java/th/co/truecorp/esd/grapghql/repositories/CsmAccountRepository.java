package th.co.truecorp.esd.grapghql.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.truecorp.esd.grapghql.models.CsmAccount;

@Repository
public interface CsmAccountRepository extends CrudRepository<CsmAccount, Long>  {

	List<CsmAccount> findByCustomerId(String csmAccountId);
}
