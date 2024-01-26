package run.liara.iran.webco.IE.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin( origins = "http://localhost:3000")
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/save")
    private String saveUser(@RequestBody User user){

            userService.saveOrUpdate(user);
        return user.getId();
    }

    @GetMapping(value = "/getAll")
    private Iterable<User> getUsers(){

        return userService.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private User update(@RequestBody User user,@PathVariable(name="id")String id){
        user.setId(id);
        userService.saveOrUpdate(user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin( origins = "http://localhost:3000")
    private void deleteUser(@PathVariable(name="id")String id){
        userService.deleteUser(id);
    }

    @RequestMapping("/{id}")
    private User getUsers(@PathVariable(name = "id")String id){
        return userService.getUserById(id);
    }

}
