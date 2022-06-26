package at.fhtechnikum.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@RestController
class MaintenanceMonitorController {

    private MaintenanceMonitor maintenancemonitor = new MaintenanceMonitor();

    @GetMapping("/api/maintenanceMode")
    public String getMessage() {
        return maintenancemonitor.getMessage();
    }

    @PutMapping("/updateMessage/{message}")
    public void updateMessage(@PathVariable String message) {
        maintenancemonitor.updateMessage(message);
    }

    @PutMapping("/resetMessage")
    public void resetMessage() {
        maintenancemonitor.resetMessage();
    }


    @RequestMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Index.html");
        return modelAndView;
    }

}
