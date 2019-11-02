package spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage(){
        //System.out.println("inside show page");
        return "main-menu";
    }
}
