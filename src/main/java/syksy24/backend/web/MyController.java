package syksy24.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {

    // @RequestMapping("/main")
    // @ResponseBody
    // public String showMessage() {
    //     return "Eka SB sovellukseni";
    // }

    @RequestMapping("/main2")
    @ResponseBody
    public String showMessage2() {
        return "Toka kutsu";
    }

    @RequestMapping("/sayHelloAndAge")
    @ResponseBody
    public String returnGreeting(@RequestParam(name = "nimesi", required = false, defaultValue = "nimetön") String etuNimi,
            @RequestParam int age) {
        return "Hei " + etuNimi + ", " + age + " vuotta";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String indexMessage() {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String contactMessage() {
        return "This is the contact page";
    }

    @RequestMapping("/helloLocation")
    @ResponseBody
    public String helloLocationMessage(@RequestParam String location, @RequestParam String name) {
        return "Welcome to the " + location + " " + name + "!";
    }

    @GetMapping("/hello")
    public String helloMessage(@RequestParam String name, @RequestParam int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "hello";
    }
    

}
