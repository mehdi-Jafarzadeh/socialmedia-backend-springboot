package run.liara.iran.webco.IE.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostsRepository postsRepository;
    public List<Post> AllPosts(){
    return postsRepository.findAll();
    }

    public Optional<Post> singlePost(String id){
        return postsRepository.findBy(id);
    }

    public Post createPost(String title , String text) {

        Post post = postsRepository.insert(new Post(
                title,
                text
        ));

        return post;
    }
}
