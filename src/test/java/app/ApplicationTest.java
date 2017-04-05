package app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testApplicationStart() {
        Application app = new Application();
        app.main(new String[]{});

    }
}
