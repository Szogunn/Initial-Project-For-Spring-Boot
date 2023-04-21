package pl.sda.OrangeJavaPL2.firstRestApi;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Profile("dev")
@RestController
public class DevCustomRestController {

    @GetMapping(path = "/hello")
    public String helloDev() {
        return "Heloł from DEV";
    }




}
