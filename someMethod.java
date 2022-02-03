import java.util.Random;

public class someMethod {
    public static int returnsNumberOfFailsIGetEachPA() {
        Random rand = new Random();
  
        return rand.nextInt(100) + 100; 
    }
}
