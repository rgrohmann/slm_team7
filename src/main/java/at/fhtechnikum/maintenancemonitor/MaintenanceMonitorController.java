package at.fhtechnikum.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    @GetMapping("/getMessage")
    public String getMessage(){
        return getMessage();
    };
}
