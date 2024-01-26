package run.liara.iran.webco.IE.Auth;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User ,String> {

}
