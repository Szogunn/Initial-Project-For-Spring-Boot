package pl.sda.OrangeJavaPL2.firstRestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestApiController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello world";
    }
}
