package Sophmore;

public class Tile {
    char letter;
    int value;
    public static void main(String[] args) {
        testTile();
    }
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    public static void printTile(Tile tPrint) {
        System.out.println("The tile " + tPrint.letter + " has the score of " + tPrint.value);
    }
    public static void testTile() {
        Tile test = new Tile('z', 10);
        printTile(test);
    }
}