package Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller

public class Controller {
    @GetMapping("/")
    @ResponseBody
    public String Controller() {
        return "would";
    }

}
