import org.junit.Test;

import static org.junit.Assert.*;

public class BrainFuckParserTest {
    @Test
    public void HelloWorldTest(){
        String helloWordBrainFuck = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++" +
                ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++." +
                "------.--------.>+.>";

        BrainFuckParser brainFuckParser = new BrainFuckParser(helloWordBrainFuck);
        brainFuckParser.parse();

        assertEquals(brainFuckParser.executeCommands(),"Hello World!");
    }

}