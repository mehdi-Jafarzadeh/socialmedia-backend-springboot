package run.liara.iran.webco.IE.Post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    private String id;
    private String title;
    private String uname;
    private String text;
    private Integer like;
    private List CmIds;
    private String num;

    public Post(String title, String text) {
        this.title = title;
        this.text = text;
    }
}
