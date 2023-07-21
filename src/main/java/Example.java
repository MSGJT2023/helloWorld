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

    @RequestMapping("/hello-world/dian")
    String name() {return "Hello my name is Dian";
    }

    @RequestMapping("/hello-world/vlad")
    String vladiordache146() {
        return "Hello my name is Dian";
    }

    @RequestMapping("/hello-world/serengheugabriel")
    String serengheugabriel() {
        return "Hola de la JT";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
