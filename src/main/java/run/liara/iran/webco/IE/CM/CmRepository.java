package run.liara.iran.webco.IE.CM;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmRepository extends MongoRepository<Cm, String> {
}
