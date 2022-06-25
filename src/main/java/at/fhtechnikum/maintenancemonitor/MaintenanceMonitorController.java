package at.fhtechnikum.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
class MaintenanceMonitorController {

    private String message;
/*
    @RequestMapping("/")
    @ResponseBody
    public String Index() {
        return "Index";
    }
*/
public class MyRestController {
    @RequestMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Index.html");
        return modelAndView;
    }
}

    @GetMapping("/getMessage")
    public String getMessage(){
        return message;
    }

    @PutMapping("/updateMessage/{message}")
    public void updateMessage(@PathVariable String message){
        this.message = message;
    }

    @PutMapping("/resetMessage")
    public void resetMessage() {
        this.message = "";
    }
}
