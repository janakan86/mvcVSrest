package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;

/**
 * Created by janakan on 30/12/16.
 */

@Controller
@RequestMapping("mvc")
public class MVCHelloWorldController {

    @RequestMapping("/hello")
    public String returnHelloWorld(@RequestParam("name") String name, Model model){

        model.addAttribute("message","hello world MVC "+name);
        return "helloworld";
    }

    @PostConstruct
    public void beanLoading(){
        System.out.println(" >>>>>>>>>>>>>>>> MVC bean getting loaded");
    }

}
