
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;




import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.exe2;

public class test2 {
    private static exe2 obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new exe2();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;

    }

    @Test
    public void testexe2()
    {
        assertEquals("Something is wrong in the logic", new String[]{"Number out of Range"}, obj.Exe2(123));
        assertEquals("Something is wrong in the logic", new String[]{"Number out of Range"}, obj.Exe2(12));
        assertEquals("Something is wrong in the logic", new String[]{"Tom"}, obj.Exe2(23));
        assertEquals("Something is wrong in the logic", new String[]{"Jerry"}, obj.Exe2(24));
    }

    @Test
    public void testexe2failure() {
        assertNotEquals("Something is wrong in the logic", new String[]{"Number out of Range"}, obj.Exe2(21));
    }





}



