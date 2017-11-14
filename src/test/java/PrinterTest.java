import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    @Test
    public void onePrint() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);

        Increment increment = new Increment();

        for (int i = 0; i < 65; i++) {
            increment.execute(memory);
        }

        Printer printer = new Printer();
        printer.execute(memory);

        assertEquals(memory.getOutputString(),"A");
    }

    @Test
    public void tenPrints() {

        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);
        Printer printer = new Printer();

        Increment increment = new Increment();

        for (int i = 0; i < 65; i++) {
            increment.execute(memory);
        }

        for (int i = 0; i < 10; i++) {
            printer.execute(memory);
        }
        assertEquals(memory.getOutputString(),"AAAAAAAAAA");
    }

}