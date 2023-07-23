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

    @RequestMapping("/hello-world/vik")
    String salut() {
        return "Salutari perverse de la Vik!";
    }



    @RequestMapping("/hello-world/galtimea")
    String galtimea() {
        return "Hello my name is Timi";
    }

    @RequestMapping("/hello-world/cosmin")
    String cosmin() {
        return "Hello my name is Cosmin";
    }

    @RequestMapping("/hello-world/serengheugabriel")
    String serengheugabriel() {
        return "Hola de la JT";
    }
    //this is a comment I will commit
    @RequestMapping("/hello-world/denis")
    String veresn() {
        return "Welcome to corporation!";
    }

    @RequestMapping("/hello-world/IoanaTincu")
    String IoanaTincu() {
        return "salut";
    }

    @RequestMapping("/hello-world/iasmina")
    String iasmina() {
        return "Java Training new feature";
    }

    @RequestMapping("/hello-world/vlad")
    String vladiordache146() {
        return "nu ma mai stergeti!!";

    @RequestMapping("/hello-world/sergiuSavu")
    String sergiuMessage() {
        return "Welcome to java training!";
    }

    @RequestMapping("/hello-world/jakabsarolta")
    String jakabsarolta() {
                return "Heyyy!!";
            }
      
    @RequestMapping("/hello-world/veresn")
    String veresn() {
        return "Hello from Noemi!";
    }

    @RequestMapping("/hello-world/biancaoprisiuJT")
    String biancaoprisiuJT() {
        return "Hello from Bia!";
    }


    @RequestMapping("/hello-world/daniel")
    String daniel() {
        return "Aloha Daniel";
    }
    @RequestMapping("/hello-world/radusiderias")
    String radusiderias() {return "Salut sef"; }
  

    @RequestMapping("/hello-world/tudor")
    String tudor() {
        return "nu Sunt Tudor Muntean";
    }

    @RequestMapping("/hello-world/miluiancu")
    String miluiancu() {
        return "Salut de la Iancu";
    }

    @RequestMapping("/hello-world/date3")
    String date3() {
        return new Date().toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
