import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static int turnCounter = 0;
    static int whosTurn = 1;
    String[][] board = new String[8][8];
    Scanner scan = new Scanner(System.in);
    String[] playerNames = new String[2];

    static String[] whitePieces = new String[6];
    static String[] blackPieces = new String[6];

    public static void printRules() {

        System.out.println("White always goes first. Black goes next, and this repeats for the rest of the game.\n" +
                "\n" +
                "To take an enemy piece, you must move a piece onto a square with the enemy piece.\n" +
                "\n" +
                "The game is won when one player traps the other player’s king piece, leaving it with no legal moves.\n" +
                "\n" +
                "Pawns can move forward one square, except on the first turn, where they can move two forward. Pawns can only attack diagonally forward.\n" +
                "\n" +
                "Knights move in an L shape, for example forward 1 tile and down 2 tiles. Knights can move over other pieces.\n" +
                "\n" +
                "Bishops can only move diagonally.\n" +
                "\n" +
                "Rooks can only move horizontally or vertically.\n" +
                "\n" +
                "The queen can move as many squares as she wants diagonally, horizontally, or vertically, making it the most powerful piece on the board.\n" +
                "\n" +
                "The king can move any direction, like the queen, but only 1 square. Protect your king.\n" +
                "\n");

    }
    public static void printBoard() {



    }

    public static void movePiece(String from,String to) {

        //king
        whitePieces[0] = "♔";
        //queen
        whitePieces[1] = "♕";
        //rook
        whitePieces[2] = "♖";
        //Bishop
        whitePieces[3] = "♗";
        //Night
        whitePieces[4] = "♘";
        //Pawn
        whitePieces[5] = "♙";


        blackPieces[0] = "♚";
        blackPieces[1] = "♛";
        blackPieces[2] = "♜";
        blackPieces[3] = "♝";
        blackPieces[4] = "♞";
        blackPieces[5] = "♟";

        if (from.substring(0,1).equalsIgnoreCase("a") || from.substring(0,1).equalsIgnoreCase("b") || from.substring(0,1).equalsIgnoreCase("c") || from.substring(0,1).equalsIgnoreCase("d") || from.substring(0,1).equalsIgnoreCase("e") || from.substring(0,1).equalsIgnoreCase("f") || from.substring(0,1).equalsIgnoreCase("g") || from.substring(0,1).equalsIgnoreCase("h")) {

            if (from.substring(0,1).equalsIgnoreCase("a")) {

                int tempX = 1;
                int tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("b")) {

                int tempX = 2;
                int tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("c")) {

                int tempX = 3;
                int tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("d")) {

                int tempX = 4;
                int tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("e")) {

                int tempX = 5;
                int tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("f")) {

                int tempX = 6;
                int tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("g")) {

                int tempX = 7;
                int tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("h")) {

                int tempX = 8;
                int tempY = Integer.parseInt(from.substring(1));

            }

        } else {

            System.out.println("Please enter a valid Coordinate. the first coordinate you entered is invalid.");

        }

    }



    public static void emptyScreen() {
        //prints 15 empty lines
        for (int i = 1; i < 15; i++) {

            System.out.println("");

        }

    }
    public static void emptyScreen(int a) {

        for (int i = 1; i < a; i++) {

            System.out.println("");

        }

    }

    //    public void move(String fromOnBoardX, String toOnBoard) {
//
//        if ()
//
//    }
    public static void main(String[] args) {

        // important variables
        boolean gameOver = false;
        Scanner scan = new Scanner(System.in);
        String[] playerNames = new String[2];
        String userInput = "";



        //king
        whitePieces[0] = "♔";
        //queen
        whitePieces[1] = "♕";
        //rook
        whitePieces[2] = "♖";
        //Bishop
        whitePieces[3] = "♗";
        //Night
        whitePieces[4] = "♘";
        //Pawn
        whitePieces[5] = "♙";


        blackPieces[0] = "♚";
        blackPieces[1] = "♛";
        blackPieces[2] = "♜";
        blackPieces[3] = "♝";
        blackPieces[4] = "♞";
        blackPieces[5] = "♟";

        // doing the setup for the game

        System.out.println("Welcome To Chess!");
        System.out.println("this is a two player game.");
        System.out.println("what will the name of the first player be?");
        playerNames[0] = scan.nextLine();
        System.out.println("what will the name of the second player be?");
        playerNames[1] = scan.nextLine();
        System.out.println("you can type \"RULES\" to see the rules as needed!");

        // clear the board and set up the chess set
        emptyScreen();
        printBoard();


        //main game loop
        while (!gameOver) {

            System.out.println("enter a command. (move, rules)");
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("move")) {

                int movePieceFrom[][] = new int[1][1];
                int movePieceTo[][] = new int[1][1];
                System.out.println("Please Enter the coordinate of the piece you want to move. ex: F1");
                userInput = scan.nextLine();
                String to = userInput;
                System.out.println("Please Enter the coordinate where the piece should move. ex: G3");
                userInput = scan.nextLine();
                movePiece(to, userInput);




            } else if (userInput.equalsIgnoreCase("rules")) {

                printRules();
                System.out.println("");
                System.out.println("are you done reading the rules? (y/n)");
                String donewithrules = "";
                donewithrules = scan.nextLine();
                if (donewithrules.equalsIgnoreCase("y")) {

                    emptyScreen();
                    printBoard();

                }


            } else {

                System.out.println("Please Enter a Valid command!");

            }

        }



    }
}
