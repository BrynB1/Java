package Junior;

import java.util.Random;
//keep rerunning the program for random movements
abstract class Animal {
    protected String symbol;

    Animal(String symbol) {
        this.symbol = symbol;
    }

    abstract void move();

    static Animal createRandomAnimal() {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        if (randomNum == 0) {
            return new Bear();
        } else if (randomNum == 1) {
            return new Fish();
        } else {
            return null;
        }
    }
}

class Bear extends Animal {
    Bear() {
        super("B");
    }

    @Override
    void move() {
        Random random = new Random();
        int direction = random.nextInt(2);
        System.out.println("Bear moved " + (direction == 0 ? "left" : "right"));
    }
}

class Fish extends Animal {
    Fish() {
        super("F");
    }

    @Override
    void move() {
        Random random = new Random();
        int direction = random.nextInt(2);
        System.out.println("Fish moved " + (direction == 0 ? "left" : "right"));
    }
}

class AnimalInteraction {
    public static void main(String[] args) {
        int gridSize = 10;
        Animal[] grid = new Animal[gridSize];
        Random random = new Random();

        for (int i = 0; i < gridSize; i++) {
            grid[i] = Animal.createRandomAnimal();
        }

        System.out.println("Initial Grid:");
        printGrid(grid);
        System.out.println();

        for (int moveCount = 1; moveCount <= 5; moveCount++) {
            int movingIndex = random.nextInt(gridSize);
            Animal movingAnimal = grid[movingIndex];

            if (movingAnimal != null) {
                int direction = random.nextInt(2);
                int newIndex = movingIndex + (direction == 0 ? -1 : 1);

                if (newIndex >= 0 && newIndex < gridSize && grid[newIndex] == null) {
                    grid[newIndex] = movingAnimal;
                    grid[movingIndex] = null;
                    movingAnimal.move();
                }
            }

            System.out.println("Move " + moveCount + ":");
            printGrid(grid);
            System.out.println();
        }
    }

    private static void printGrid(Animal[] grid) {
        for (Animal animal : grid) {
            if (animal != null) {
                System.out.print(animal.symbol + " ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println();
    }
}
