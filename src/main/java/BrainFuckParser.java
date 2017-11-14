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

        char charArrayOfOperation[] = brainfuckExpression.toCharArray();
        LinkedList<Array> stackArrays = new LinkedList<>();
        Operation [] operations = converToEnumArray(charArrayOfOperation);


        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case GREATERTHAN:
                    if (stackArrays.isEmpty())
                        commands.add(new MoveRight());
                    else
                        stackArrays.peek().addCommand(new MoveRight());
                    break;
                case LESSTHAN:
                    if (stackArrays.isEmpty())
                        commands.add(new MoveLeft( ));
                    else
                        stackArrays.peek().addCommand(new MoveLeft( ));
                    break;
                case PLUS:
                    if (stackArrays.isEmpty())
                        commands.add(new Increment( ));
                    else
                        stackArrays.peek().addCommand(new Increment( ));
                    break;
                case MINUS:
                    if (stackArrays.isEmpty())
                        commands.add(new Decrement( ));
                    else
                        stackArrays.peek().addCommand(new Decrement( ));
                    break;
                case DOT:
                    if (stackArrays.isEmpty())
                        commands.add(new Printer( ));
                    else
                        stackArrays.peek().addCommand(new Printer( ));
                    break;
                case LEFTSQUAREBRACKET:
                    stackArrays.push(new Array());
                    break;
                case RIGHTSQUAREBRACKET:
                    commands.add(stackArrays.pop());
                    break;
            }
        }


    }


    private Operation[] converToEnumArray(char arr[]){
        Operation [] operations = new Operation[arr.length];
        for (int i = 0; i < arr.length; i++) {
            switch(arr[i]){
                case '>': operations[i]=Operation.GREATERTHAN;
                    break;
                case '<': operations[i]=Operation.LESSTHAN;
                    break;
                case '+': operations[i] = Operation.PLUS;
                    break;
                case '-': operations[i] = Operation.MINUS;
                    break;
                case '.': operations[i] = Operation.DOT;
                    break;
                case '[': operations[i] = Operation.LEFTSQUAREBRACKET;
                    break;
                case ']': operations[i] = Operation.RIGHTSQUAREBRACKET;
                    break;
            }
        }
        return operations;
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
