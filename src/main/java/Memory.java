/**
 * Class that represents API for working with  operation '+' in brainFuck language;
 */
public class Memory {

    private int pointer = 0;
    private char [] array = new char [20];
    private StringBuffer outputString = new StringBuffer("");

    /**
     * Method return current value that corresponds to point;
     */
    public int getCurrentValue() {
        return this.array[this.pointer];
    }

    /**
     * Method increases the value of point by one;
     */
    public void moveRight(){
        this.pointer ++;
    }

    /**
     * Method decreases the value of point by one;
     */
    public void moveLeft(){
        this.pointer --;
    }

    /**
     * Method increases value that corresponds to point by one;
     */
    public void increase(){
        this.array[this.pointer]++;
    }

    /**
     * Method decreases value that corresponds to point by one;
     */
    public void decries(){
        this.array[this.pointer]--;
    }

    public int getPointer(){
        return pointer;
    }
    public String getOutputString(){
        return outputString.toString();
    }

    /**
     * Method adds symbol in output String;
     */
    public void print(){
        outputString.append(getCurrentValue());
    }
    /**
     * Method outputs outputString in console;
     */
    public void display(){
        System.out.println(outputString);
    }


}