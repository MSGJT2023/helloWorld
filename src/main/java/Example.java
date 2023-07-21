import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/hello-world")
    String home() {
        return "Hello World - v5!";
    }

    @RequestMapping("/hello-world/date")
    String date() {
        return new Date().toString();
    }

    @RequestMapping("/hello-world/denis")
    String name() {return "Hello my name is Denis";
    }

    @RequestMapping("/hello-world/galtimea")
    String galtimea() {
        return "Hello my name is Timi";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
