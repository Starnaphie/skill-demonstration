import java.util.Random;

public class someMethod {
    public int returnsNumberOfFailsIGetEachPA() {
        Random rand = new Random();
  
        return rand.nextInt(100) + 100; 
    }
}
