package JUnit.Run;
//https://coderlessons.com/tutorials/java-tekhnologii/vyuchit-junit/junit-kratkoe-rukovodstvo
public class MessageUtil {

    private String message;

    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
