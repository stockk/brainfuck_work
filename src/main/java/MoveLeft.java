/**
 * Class that represents API for working with  operation '<' in brainFuck language;
 */
public class MoveLeft implements Command {
    @Override
    public void execute(Memory memory) {
        memory.moveLeft();
    }

}