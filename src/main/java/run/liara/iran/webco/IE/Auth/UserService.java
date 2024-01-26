package run.liara.iran.webco.IE.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void saveOrUpdate(User user) {
        userRepo.save(user)  ;
    }


    public Iterable<User> listAll() {

        return this.userRepo.findAll();

    }

    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }

    public User getUserById(String id) {
       return userRepo.findById(id).get();
    }
}
