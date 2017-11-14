
public class MoveRight implements Command {
    @Override
    public void execute(Memory memory) {
        memory.moveRight();
    }
}