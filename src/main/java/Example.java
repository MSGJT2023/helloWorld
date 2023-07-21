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

    @RequestMapping("/hello-world/vladpasca")
    String vladpasca17() {
        return "Hello my name is Vlad Pasca";
    }

    @RequestMapping("/hello-world/serengheugabriel")
    String serengheugabriel() {
        return "Hola de la JT";
    }

    @RequestMapping("/hello-world/radusiderias")
    String radusiderias() {return "Salut sef"; }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
