import static org.junit.Assert.*;
import org.junit.*;

public class someMethodTester {
    @Test
    public void someMethodTest() {
        assertEquals(50, returnsNumberOfFailsIGetEachPA()); // will fail
    }
}

// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar someMethodTester.java

// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore someMethodTester