import org.junit.Test;

import static org.junit.Assert.*;

public class BrainFuckParserTest {
    @Test
    public void HelloWorldTest(){
        String helloWordBrainFuck = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++" +
                ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++." +
                "------.--------.>+.>";

        BrainFuckParser brainFuckParser = new BrainFuckParser();
        brainFuckParser.parse(helloWordBrainFuck);

        assertEquals(brainFuckParser.executeCommands(),"Hello World!");
    }

    @Test(expected = Exception.class)
    public void nullString(){
        BrainFuckParser brainFuckParser = new BrainFuckParser();
        brainFuckParser.parse(null);
    }

}