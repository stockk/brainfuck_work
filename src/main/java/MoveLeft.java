public class MoveLeft implements Command {
    @Override
    public void execute(Memory memory) {
        memory.moveLeft();
    }

}