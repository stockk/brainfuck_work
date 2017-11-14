/**
 * Class that represents API for working with  operation '+' in brainFuck language;
 */
public class Increment implements Command {

    @Override
    public void execute(Memory memory) {
        memory.increase();
    }

}