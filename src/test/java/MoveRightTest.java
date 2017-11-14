import org.junit.Test;

import static org.junit.Assert.*;

public class MoveRightTest {

    @Test
    public void oneMove() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);
        MoveRight moveRight = new MoveRight();
        moveRight.execute(memory);
        assertEquals(memory.getPointer() -1,0);
    }

    @Test
    public void tenMoves() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);
        MoveRight moveRight = new MoveRight();

        for (int i = 0; i < 10; i++) {
            moveRight.execute(memory);
        }
        assertEquals(memory.getPointer()-10,00);
    }

}