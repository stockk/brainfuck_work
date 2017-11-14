import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    @Test
    public void onePrint() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);

        Printer printer = new Printer();
        printer.execute(memory);
        System.out.println(memory.getOutputString());
        assertEquals(memory.getOutputString(),"0");
    }

    @Test
    public void tenPrints() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);
        Printer printer = new Printer();
        for (int i = 0; i < 10; i++) {
            printer.execute(memory);
        }
        assertEquals(memory.getOutputString(),"0000000000");
    }

}