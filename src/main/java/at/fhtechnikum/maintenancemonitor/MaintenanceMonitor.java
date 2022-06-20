package at.fhtechnikum.maintenancemonitor;

public class MaintenanceMonitor {

    private String message = "";

     public String getMessage() {
        return message;
    }

    public String updateMessage(String message){
         this.message = message;
        return "Message updated with: " + message + ".";
    }

    public String resetMessage(){
         updateMessage("");
        return "success!";
    }
}
