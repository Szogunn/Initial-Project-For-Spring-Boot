package pl.sda.OrangeJavaPL2.firstRestApi;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Profile("prd")
@RestController
public class PrdCustomRestController {

    @GetMapping(path = "/hello")

    public String helloPrd() {
        return "Heloł from PROD";
    }

}
