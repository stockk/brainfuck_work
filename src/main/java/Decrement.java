public class Decrement implements Command {
    @Override
    public void execute(Memory memory) {
        memory.decries();
    }
}