package ci.boobacool.Projetcicd;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/cicd", produces = MediaType.APPLICATION_JSON_VALUE)
public class CiCdController {

    @GetMapping()
    List<Object> searchList(){
        return List.of(new Sa(1,"Formation",1));
    }
}
