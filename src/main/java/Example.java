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

    @RequestMapping("/hello-world/date2")
    String date2() {
        return new Date().toString();
    }

    @RequestMapping("/hello-world/biancaoprisiuJT")
    String biancaoprisiuJT() {
        return "Hello from Bia!";
    }
    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
