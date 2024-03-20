package Sophmore;

import java.util.Random;
import java.util.Scanner;

class tictactoe {
    public static void main(String[] args) {
        Scanner reader1 = new Scanner(System.in);
        System.out.println("Would you like to play against another player(1), the computer(2), or quit(3)?");
        int choice = reader1.nextInt();
        if (choice == 1) {
            playGame1();
        }
        else if (choice == 2) {
            playGame2();
        }
        else if (choice == 3) {
            System.exit(0);
        }
    }
    public static void playGame1(){
        String[][] arr = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        System.out.println("Welcome to Tic Tac Toe (2 player Edition!)");
        printBoard(arr);
        Scanner reader1 = new Scanner(System.in);
        int player = 1;
        while (!winner(arr) && player < 10)
        {
            System.out.print("Player please enter a row (0-2): ");
            int row = reader1.nextInt();
            System.out.print("Player please enter a col (0-2): ");
            int col = reader1.nextInt();
            if (arr[row][col].equals(" "))
            {
                if (player % 2 == 1)
                {
                    arr[row][col] = "x";
                }
                else
                {
                    arr[row][col] = "o";
                }
                player ++;
                printBoard(arr);
            }
            else
            {
                System.out.print("Please try again as this spot is taken. \n");
            }
        }
    }

    public static void printBoard(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < 2)
                    System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(" - ");
                }
                System.out.println();
            }
        }
    }

    // determine winner
    public static boolean winner(String[][] arr)
    {
        //top row -
        if (arr[0][0].equals(arr[0][1]) && arr[0][0].equals(arr[0][2]) && !arr[0][0].equals(" "))
        {
            System.out.println(arr[0][0] + " is the winner!");
            return true;
        }
        //middle row -
        if (arr[1][0].equals(arr[1][1]) && arr[1][0].equals(arr[1][2]) && !arr[1][0].equals(" "))
        {
            System.out.println(arr[1][0] + " is the winner!");
            return true;
        }
        //bottom row -
        if (arr[2][0].equals(arr[2][1]) && arr[2][0].equals(arr[2][2]) && !arr[2][0].equals(" "))
        {
            System.out.println(arr[2][0] + " is the winner!");
            return true;
        }
        //left column |
        if (arr[0][0].equals(arr[1][0]) && arr[0][0].equals(arr[2][0]) && !arr[0][0].equals(" "))
        {
            System.out.println(arr[0][0] + " is the winner!");
            return true;
        }
        //middle column |
        if (arr[0][1].equals(arr[1][1]) && arr[0][1].equals(arr[2][1]) && !arr[0][1].equals(" "))
        {
            System.out.println(arr[0][0] + " is the winner!");
            return true;
        }
        //right column |
        if (arr[0][2].equals(arr[1][2]) && arr[0][2].equals(arr[2][2]) && !arr[0][2].equals(" "))
        {
            System.out.println(arr[0][0] + " is the winner!");
            return true;
        }
        //diagonal 1 /
        if (arr[2][0].equals(arr[1][1]) && arr[2][0].equals(arr[0][2]) && !arr[2][0].equals(" "))
        {
            System.out.println(arr[0][0] + " is the winner!");
            return true;
        }
        //diagonal 2 \
        if (arr[0][0].equals(arr[1][1]) && arr[0][0].equals(arr[2][2]) && !arr[0][0].equals(" "))
        {
            System.out.println(arr[0][0] + " is the winner!");
            return true;
        }
        return false;
    }
    public static void playGame2(){
        System.out.println("Welcome to Tic Tac Toe! (Computer Edition)");
        Scanner scanner = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        printBoard(board);
        while (true) {
            playerTurn(board, scanner);
            if (printWinner(board)){
                break;
            }
            printBoard(board);
            computerTurn(board);
            if (printWinner(board)){
                break;
            }
            printBoard(board);
        }
        scanner.close();
    }
    private static boolean printWinner(char[][] board) {
        if (checkWinner(board, 'X')) {
            printBoard(board);
            System.out.println("Player wins!");
            return true;
        }
        if (checkWinner(board, 'O')) {
            printBoard(board);
            System.out.println("Computer wins!");
            return true;
        }
        for (char[] chars : board) {
            for (char aChar : chars) {
                if (aChar == ' ') {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("The game ended in a tie!");
        return true;
    }
    private static boolean checkWinner(char[][] board, char symbol) {
        return (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol)
                ||(board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol)
                || (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol)
                ||(board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol)
                ||(board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol)
                ||(board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol)
                ||(board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
                || (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }
    private static void computerTurn(char[][] board) {
        Random rand = new Random();
        int computerMove;
        do {
            computerMove = rand.nextInt(9) + 1;
        } while (!isValidMove(board, Integer.toString(computerMove)));
        System.out.println("Computer chose " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
    }
    private static boolean isValidMove (char[][] board, String position) {
        return switch (position) {
            case "1" -> (board[0][0] == ' ');
            case "2" -> (board[0][1] == ' ');
            case "3" -> (board[0][2] == ' ');
            case "4" -> (board[1][0] == ' ');
            case "5" -> (board[1][1] == ' ');
            case "6" -> (board[1][2] == ' ');
            case "7" -> (board[2][0] == ' ');
            case "8" -> (board[2][1] == ' ');
            case "9" -> (board[2][2] == ' ');
            default -> false;
        };
    }
    private static void playerTurn(char[][] board, Scanner scanner) {
        String userInput;
        while (true) {
            System.out.println("Please enter your move(1-9):");
            userInput = scanner.nextLine();
            if (isValidMove(board, userInput)){
                break;
            } else {
                System.out.println(userInput + " is not a valid move.");
                System.out.println("Please enter another move(1-9):");
            }
        }
        placeMove(board, userInput, 'X');
    }
    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1" -> board[0][0] = symbol;
            case "2" -> board[0][1] = symbol;
            case "3" -> board[0][2] = symbol;
            case "4" -> board[1][0] = symbol;
            case "5" -> board[1][1] = symbol;
            case "6" -> board[1][2] = symbol;
            case "7" -> board[2][0] = symbol;
            case "8" -> board[2][1] = symbol;
            case "9" -> board[2][2] = symbol;
            default -> System.out.println(":(");
        }
    }
    private static void printBoard(char[][] board) {
        System.out.print((board[0][0]));
        System.out.print("|");
        System.out.print((board[0][1]));
        System.out.print("|");
        System.out.println((board[0][2]));
        System.out.println("-----");
        System.out.print((board[1][0]));
        System.out.print("|");
        System.out.print((board[1][1]));
        System.out.print("|");
        System.out.println((board[1][2]));
        System.out.println("-----");
        System.out.print((board[2][0]));
        System.out.print("|");
        System.out.print((board[2][1]));
        System.out.print("|");
        System.out.println((board[2][2]));
    }
}
