package at.fhtechnikum.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    private String message;

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
