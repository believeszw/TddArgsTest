package bobdeng.tdd;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CommandTest {
    @Test
    public void testHasValue(){
        Command command = new Command("-l true -d /user/local");
        assertEquals(command.getValue("l"), "true");
        assertEquals(command.getValue("d"), "/user/local");
    }
    @Test
    public void testHasNoValue(){
        Command command = new Command("-l -d /user/local");
        assertNull(command.getValue("l"));
        assertEquals(command.getValue("l"), null);
    }
    @Test
    public void testHasNegative(){
        Command command = new Command("-l -p -9 -d /user/local");
        assertNull(command.getValue("l"));
        assertEquals(command.getValue("p"), "-9");
        assertEquals(command.getValue("d"), "/user/local");
    }
}

