package bobdeng.tdd;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import javax.xml.validation.Schema;

public class SchemaTest {

    @Test
    public void testBool(){
        Schemas schema = new Schemas("l:bool");
        assertEquals(schema.getValue("l","true"), Boolean.TRUE);
        assertEquals(schema.getValue("l","false"), Boolean.FALSE);
        assertEquals(schema.getValue("l",null), Boolean.FALSE);
    }
    @Test
    public void testInt(){
        Schemas schema = new Schemas("p:int");
        assertEquals(schema.getValue("p","8080"),8080);

    }
    @Test
    public void testStr(){
        Schemas schema = new Schemas("d:str");
        assertEquals(schema.getValue("d", "hello"),"hello");

    }
}
