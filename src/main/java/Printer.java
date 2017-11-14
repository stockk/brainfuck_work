/**
 * Class that represents API for working with  operation '.' in brainFuck language;
 */
public class Printer implements Command {
    @Override
    public void execute(Memory memory) {
        memory.print();
    }
}