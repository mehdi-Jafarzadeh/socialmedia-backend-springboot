package run.liara.iran.webco.IE.CM;

//import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cm")
@Data
@AllArgsConstructor
public class Cm {

    private String text ;
    private Integer postId ;

}
