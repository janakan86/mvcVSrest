package Controller;

/**
 * Created by janakan on 3/1/17.
 */

import Beans.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class RESTHelloWorldController {

    @RequestMapping("hello")
    public Greeting returnHelloWorld(@RequestParam("name") String name){
        return new Greeting("Hello  World REST "+ name);
    }
}
