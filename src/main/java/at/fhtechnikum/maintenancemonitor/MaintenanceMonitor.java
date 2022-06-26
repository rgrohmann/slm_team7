package at.fhtechnikum.maintenancemonitor;

public class MaintenanceMonitor {

    private String message = "";

    public String getMessage(){
        return message;
    }

    public void updateMessage(String input){
        this.message = input;
    }

    public void resetMessage(){
        this.message = "-";
    }
}
