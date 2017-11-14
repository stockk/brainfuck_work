
public class Memory {

    private int pointer = 0;
    private char [] array = new char [20];

    public int getCurrentValue() {
        return this.array[this.pointer];
    }

    public void moveRight(){
        this.pointer ++;
    }

    public void moveLeft(){
        this.pointer --;
    }

    public void increase(){
        this.array[this.pointer]++;
    }

    public void decries(){
        this.array[this.pointer]--;
    }

    public void print(){
            System.out.print(array[pointer]);
    }

}