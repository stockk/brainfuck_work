import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Class converts a string to a sequence of commands .
 *
 */
public class BrainFuckParser {


    private ArrayList<Command> commands;
    private String brainfuckExpression;

    public BrainFuckParser(String brainfuckExpression) {
        this.brainfuckExpression = brainfuckExpression;
        this.commands = new ArrayList<>();
    }

    public void parse(){

        char arr[] = brainfuckExpression.toCharArray();
        LinkedList<Array> stackArrays = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            switch (arr[i]) {
                case '>':
                    if (stackArrays.isEmpty())
                        commands.add(new MoveRight());
                    else
                        stackArrays.peek().addCommand(new MoveRight());
                    break;
                case '<':
                    if (stackArrays.isEmpty())
                        commands.add(new MoveLeft( ));
                    else
                        stackArrays.peek().addCommand(new MoveLeft( ));
                    break;
                case '+':
                    if (stackArrays.isEmpty())
                        commands.add(new Increment( ));
                    else
                        stackArrays.peek().addCommand(new Increment( ));
                    break;
                case '-':
                    if (stackArrays.isEmpty())
                        commands.add(new Decrement( ));
                    else
                        stackArrays.peek().addCommand(new Decrement( ));
                    break;
                case '.':
                    if (stackArrays.isEmpty())
                        commands.add(new Printer( ));
                    else
                        stackArrays.peek().addCommand(new Printer( ));
                    break;
                case '[':
                    stackArrays.push(new Array());
                    break;
                case ']':
                    commands.add(stackArrays.pop());
                    break;
            }
        }


    }

    public String executeCommands(){

        Memory memory = new Memory();

        for (Command c:
        commands){
            c.execute(memory);
        }

        return memory.getOutputString();
    }


}
