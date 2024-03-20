package Junior;

public class numLinked {
    private final int num;
    private int freq;
    private numLinked next;
    public numLinked(int num) {
        this.num= num;
        this.freq=0;
        this.next=null;
    }
    public int getNum() {return num; }
    public int getFreq() {return freq; }
    public numLinked getNext() {return next;}
    public void updateFreq() {
        freq++;
    }
    public void setNext(numLinked next){
        this.next=next;
    }
    public void display(){
        System.out.println("Number "+num+" occurred "+ freq + " times.");
    }
}
