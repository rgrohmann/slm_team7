package at.fhtechnikum.maintenancemonitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaintenanceMonitorApplicationTests {

    @Test
    void getMessageTest(){
        //arrange
        MaintenanceMonitor maint = new MaintenanceMonitor();
        //act
        String messageTest = maint.getMessage();
        //assert
        Assertions.assertEquals("", messageTest);
    }

    @Test
    void updateMessageTest(){
        //arrange
        MaintenanceMonitor maint = new MaintenanceMonitor();
        //act
        maint.updateMessage("online");
        //assert
        Assertions.assertEquals("online", maint.getMessage());
    }

    @Test
    void resetMessageTest(){
        //arrange
        MaintenanceMonitor maint = new MaintenanceMonitor();
        //act
        maint.updateMessage("online");
        maint.resetMessage();
        //assert
        Assertions.assertEquals("-", maint.getMessage());
    }

    //READY
}
