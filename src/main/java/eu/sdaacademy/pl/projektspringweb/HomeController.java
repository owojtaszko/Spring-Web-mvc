package eu.sdaacademy.pl.projektspringweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "Simple text";
    }

    @GetMapping("/home")
    public String homesExampleJspFile(Model model){

        model.addAttribute("name",
                "Junior Software Developer");

        model.addAttribute("projects",
                projectRepository.getProjects());

        return "home"; //nazwa pliku .jsp,  (tutaj home.jsp)
    }
}
