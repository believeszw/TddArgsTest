package bobdeng.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ArgsTest {
    @Test
    public void test() {
        Args args = new Args("l:bool,p:int,d:str", "-l true -p 8080 -d /usr/local");
        assertEquals(args.getValue("l"), Boolean.TRUE);
        assertEquals(args.getValue("d"), "/usr/local");
        assertEquals(args.getValue("p"), 8080);
    }

    @Test
    public void testWithNumber() {
        Args args = new Args("l:bool,p:int,p:string,s:str", "-l true -p -9 -d /usr/local");
        assertEquals(args.getValue("l"), Boolean.FALSE);
        assertEquals(args.getValue("p"), -9);
        assertEquals(args.getValue("d"), "/usr/local");
    }
}
