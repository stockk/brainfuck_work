/**
 * Class that represents API for working with  operation '+' in brainFuck language;
 */
public class Memory {

    private int pointer = 0;
    private char[] array = new char[20];
    private StringBuffer outputString = new StringBuffer();

    /**
     * Method return current value that corresponds to point;
     */
    public int getCurrentValue() {
        return this.array[this.pointer];
    }

    /**
     * Method increases the value of point by one;
     */
    public void moveRight() {
        if (pointer == array.length - 1) pointer = 0;
        this.pointer++;
    }

    /**
     * Method decreases the value of point by one;
     */
    public void moveLeft() {
        if (pointer == 0) pointer = array.length - 1;
        this.pointer--;
    }

    /**
     * Method increases value that corresponds to point by one;
     */
    public void increase() {
        this.array[this.pointer]++;
    }

    /**
     * Method decreases value that corresponds to point by one;
     */
    public void decries() {
        this.array[this.pointer]--;
    }

    /**
     * Method adds symbol in output String;
     */
    public void print() {
        outputString.append(this.array[this.pointer]);
    }

    public int getPointer() {
        return pointer;
    }

    public String getOutputString() {
        return outputString.toString();
    }


}