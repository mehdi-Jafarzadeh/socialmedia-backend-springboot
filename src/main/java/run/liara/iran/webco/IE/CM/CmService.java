package run.liara.iran.webco.IE.CM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import run.liara.iran.webco.IE.Post.Post;

import java.util.List;

@Service
public class CmService {
    @Autowired
        private CmRepository cmRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Cm> AllCms(){
        return cmRepository.findAll();
    }
    public Cm createCm(String text , Integer postId){

        Cm cm =cmRepository.insert(new Cm(text, postId));

    mongoTemplate.update(Post.class).matching(Criteria.where("num").is(postId)).apply( new Update().push("CmIds").value(cm)).first();

    return cm;


    }
}
