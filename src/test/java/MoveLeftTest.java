import org.junit.Test;

import static org.junit.Assert.*;

public class MoveLeftTest {

    @Test
    public void oneMove() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);

        MoveRight moveRight = new MoveRight();
        moveRight.execute(memory);

        MoveLeft moveLeft = new MoveLeft();
        moveLeft.execute(memory);

        assertEquals(0,memory.getPointer());
    }

    @Test
    public void tenMoves() {
        Memory memory = new Memory();
        assertEquals(memory.getCurrentValue(),0);
        MoveLeft moveLeft = new MoveLeft();
        MoveRight moveRight = new MoveRight();

        for (int i = 0; i < 10; i++) {
            moveRight.execute(memory);
        }
        for (int i = 0; i < 10; i++) {
            moveLeft.execute(memory);
        }

        assertEquals(memory.getPointer(),0);
    }

}