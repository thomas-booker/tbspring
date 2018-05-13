package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TBController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }

    @RequestMapping("test")
    public String sayTest() {
        return ("Test message");
    }
}