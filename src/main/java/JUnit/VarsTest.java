package JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VarsTest {
    public static void main(String[] args) {
        PrintMassage pm = new PrintMassage("Hello");
        pm.prnMass();


    }
}

class PrintMassage{
    String massage;

    public PrintMassage(String massage) {
        this.massage = massage;
    }
    String prnMass(){
        System.out.println(massage);
        return massage;
    }
}
class Testing{
    String mass = "kuku";
    PrintMassage pm = new PrintMassage(mass);

    @Test
    void testIt(){
        Assertions.assertEquals(mass,pm.massage);
    }
}