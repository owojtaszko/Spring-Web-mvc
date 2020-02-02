package eu.sdaacademy.pl.projektspringweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "Simple text";
    }

    @GetMapping("/home")
    public String homesExampleJspFile(Model model){

        model.addAttribute("name",
                "Junior Software Developer");


        return "home"; //nazwa pliku .jsp,  (tutaj home.jsp)
    }
}
