import org.junit.Test;

import static org.junit.Assert.*;

public class MoveLeftTest {

    @Test
    public void oneMove() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);
        MoveLeft moveLeft = new MoveLeft();
        moveLeft.execute(memory);
        assertEquals(memory.getPointer() +1,0);
    }

    @Test
    public void tenMoves() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);
        MoveLeft moveLeft = new MoveLeft();

        for (int i = 0; i < 10; i++) {
            moveLeft.execute(memory);
        }
        assertEquals(memory.getPointer()+10,00);
    }

}