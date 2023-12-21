package OOP;

import java.sql.Timestamp;

public class PasswordChangeEvent extends AbstractEvent {
    
    // private final Long createdTimeStamp;
    // private final String id;

    public PasswordChangeEvent(String id){
        super(id);
    }

 

    @Override
    public void process(){
        System.out.println("Customer " + id + " changed their password. " + 
        "Sending a confirmation email to customer.");
    }
}
