import org.junit.Test;

import static org.junit.Assert.*;

public class IncrementTest {

    @Test
    public void oneIncrement() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);
        Increment increment = new Increment();
        increment.execute(memory);
        assertEquals(memory.getCurrentValue(),1);
    }

    @Test
    public void tenIncrements() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);
        Increment increment = new Increment();
        for (int i = 0; i < 10; i++) {
            increment.execute(memory);
        }
        assertEquals(memory.getCurrentValue(),10);
    }

}