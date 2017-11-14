import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents API for working with  operations '[' and ']' and  is represented like command of commands;
 */
public class Array implements Command {

    private List<Command> commands;


    public Array() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command c) {
        commands.add(c);
    }

    @Override
    public void execute(Memory memory) {
        while (memory.getCurrentValue() != 0) {
            for (Command c :
                    commands) {
                c.execute(memory);
            }
        }
    }
}
