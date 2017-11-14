import org.junit.Test;

import static org.junit.Assert.*;

public class DecrementTest {

    @Test
    public void oneDecrement() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);
        Increment increment = new Increment();
        increment.execute(memory);
        Decrement decrement = new Decrement();
        decrement.execute(memory);
        assertEquals(memory.getCurrentValue(),0);
        System.out.println(memory.getCurrentValue());
    }

    @Test
    public void tenDecrements() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);

        Increment increment = new Increment();
        for (int i = 0; i < 10; i++) {
            increment.execute(memory);
        }

        Decrement decrement = new Decrement();
        for (int i = 0; i < 10; i++) {
            decrement.execute(memory);
        }
        assertEquals(memory.getCurrentValue(),0);
    }

}