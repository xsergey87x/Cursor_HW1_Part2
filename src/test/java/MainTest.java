import org.example.Main;
import org.example.Utility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.Utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @BeforeEach
    void setUpMainClass() {
        Main mainClass = new Main();
        mainClass.sayHello();
    }

    @Test
    void helloWorld() {
        Main mainClass = new Main();
        assertEquals("Hello world", mainClass.sayHello());
    }

    @Test
    void testFirstValue() {
        Utility utility = new Utility();
        assertEquals(8, utility.getFirstValue());
    }

}
