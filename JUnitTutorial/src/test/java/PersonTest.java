import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

    Person niko = new Person("Nikolai", "Less", 22);
    
    @Test
    public void testName() {
        assertEquals("Nikolai Less", niko.getName());
    }

}
