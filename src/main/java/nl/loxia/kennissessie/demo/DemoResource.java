package nl.loxia.kennissessie.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoResource {

    @GetMapping("/hellothere")
    @ResponseBody
    public String hellothere(){
        return "General Kenobi";
    }
}
