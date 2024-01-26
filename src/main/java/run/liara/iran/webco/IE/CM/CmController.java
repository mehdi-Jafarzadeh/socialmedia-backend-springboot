package run.liara.iran.webco.IE.CM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/cms")
public class CmController {
@Autowired
    private CmService cmService;

@GetMapping("/all")
public ResponseEntity<List<Cm>> GetCms() {
    return new ResponseEntity<List<Cm>>(cmService.AllCms(),HttpStatus.OK);
}
@PostMapping
@CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Cm> createCm(@RequestBody  Map<String , String> payload) {
    return new ResponseEntity<Cm>(cmService.createCm(payload.get("text"), Integer.valueOf(payload.get("pid") )), HttpStatus.CREATED);
}
}

