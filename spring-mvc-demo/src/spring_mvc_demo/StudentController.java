package spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model){

        Student student = new Student();

        model.addAttribute("student", student);

        return "student-form";
    }
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student){

        System.out.println("First Name: " +student.getFirstName());
        System.out.println("First Name: " +student.getLastName());
        return "student-form-confirmation";
    }

}
