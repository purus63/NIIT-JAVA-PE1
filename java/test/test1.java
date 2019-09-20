
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;




import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.exe1;

public class test1 {
    private static exe1 obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new exe1();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;

    }

    @Test
    public void testexe1()
    {
        assertEquals("Something is wrong in the logic"
                , new String[]{"String str1 = 12344321","12344321 is palindrome " +
                        "the sum of even numbers is less than 25"}, obj.Exe1(12344321l));
        assertEquals("Something is wrong in the logic"
                , new String[]{"String str1 = 12345688654321","12345688654321 is palindrome " +
                        "the sum of even numbers is greater than 25"}, obj.Exe1(12345688654321l));
        assertEquals("Something is wrong in the logic"
                , new String[]{"String str1 = 123456654321","123456654321 is palindrome " +
                        "the sum of even numbers is less than 25"}, obj.Exe1(123456654321l));
    }

    @Test
    public void testexe1failure() {
        assertNotEquals("Error: ", new String[]{"String str1 = 111","111 is palindrome the sum of even numbers is less than 25"}, obj.Exe1(111l));
    }





}



