package at.fhtechnikum.maintenancemonitor;

public class MaintenanceMonitor {

    private String message = "";

    private int zahl = 0;

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
