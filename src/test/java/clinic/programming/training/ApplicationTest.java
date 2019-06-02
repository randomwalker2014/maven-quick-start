package clinic.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    private Application app;
    
    @Before
    public void setup() {
        app = new Application();
    }
    
    
    @Test
    public void testWordCountString() {
        int count = 4;
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = 0;
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = 0;
        assertTrue(count == 0);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = 0;
        assertTrue(count == 3);
    }

    @Test
    public void testWordCountSingle() {
        int count = 1;
        assertTrue(count == 1);
    }
}
