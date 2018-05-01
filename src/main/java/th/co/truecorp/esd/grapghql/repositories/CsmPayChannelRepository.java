package th.co.truecorp.esd.grapghql.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.truecorp.esd.grapghql.models.CsmPayChannel;

@Repository
public interface CsmPayChannelRepository extends CrudRepository<CsmPayChannel, Long>  {

}
