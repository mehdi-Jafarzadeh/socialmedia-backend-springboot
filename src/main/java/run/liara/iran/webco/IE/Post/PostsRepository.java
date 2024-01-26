package run.liara.iran.webco.IE.Post;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostsRepository extends MongoRepository<Post, ObjectId> {
    Optional<Post> findBy(String id);
}
