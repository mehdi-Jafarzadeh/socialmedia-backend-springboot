package run.liara.iran.webco.IE.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin( origins = "http://localhost:3000")
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping("/all")
    @CrossOrigin( origins = "http://localhost:3000")
    public ResponseEntity<List<Post>> GetAllPosts(){
        return new ResponseEntity<List<Post>>(postService.AllPosts(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Post>> GetSingle(@PathVariable String id){
        return new ResponseEntity<Optional<Post>>(postService.singlePost(id),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Map<String , String> payload) {
        return new ResponseEntity<Post>(postService.createPost(

                payload.get("title"),
                payload.get("text")

        ), HttpStatus.CREATED);
    }

}
