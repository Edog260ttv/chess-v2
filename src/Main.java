import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static move move = new move();
    static print print = new print();
    static int turnCounter = 0;
    static int whosTurn = 1;
    static String[][] board = new String[8][8];
    Scanner scan = new Scanner(System.in);
    String[] playerNames = new String[2];

    static String[] whitePieces = new String[6];
    static String[] blackPieces = new String[6];



    public static void setBoard(int x, int y, String newPiece) {

        board[x][y] = newPiece;

    }
    public static void setWhosTurn(int i) {

        whosTurn = i;

    }

    public static int getWhosTurn() {

        return whosTurn;

    }
    public static void flipBoard() {



    }






    public String[][] getBoard() {

        return board;

    }



    public static void emptyScreen() {
        //prints 15 empty lines
        for (int i = 1; i < 30; i++) {

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

        // first questions at beginning

        System.out.println("Welcome To Chess!");
        System.out.println("this is a two player game.");
        System.out.println("what will the name of the first player be?");

        // getting player names
        boolean validName = false;
        while (!validName) {
            playerNames[0] = scan.nextLine();
            if (playerNames[0].length() < 1) {

                System.out.println("pleas enter a valid name!");

            } else {

                validName = true;

            }

        }

        validName = false;

        System.out.println("what will the name of the second player be?");

        while (!validName) {
            playerNames[1] = scan.nextLine();
            if (playerNames[1].length() < 1) {

                System.out.println("please enter a longer name!");

            } else {

                validName = true;

            }

        }


        // clear the board and set up the chess set

        print.resetBoard();
        emptyScreen();



        //main game loop
        while (!gameOver) {

            print.printBoard();

            if (whosTurn == 1) {

                System.out.println("it is " + playerNames[0] + "'s turn.");

            } else {

                System.out.println("it is " + playerNames[1] + "'s turn.");

            }

            System.out.println("enter a command. (move, rules)");
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("move") || userInput.equalsIgnoreCase("m")) {

//                int movePieceFrom[][] = new int[1][1];
//                int movePieceTo[][] = new int[1][1];
//                while () {}
                System.out.println("Please Enter the coordinate of the piece you want to move. ex: F1");
                userInput = scan.nextLine();
                String to = userInput;
                System.out.println("Please Enter the coordinate where the piece should move. ex: G3");
                userInput = scan.nextLine();
                String from = userInput;
                move.movePiece(to, from);



            } else if (userInput.equalsIgnoreCase("rules")) {

                print.printRules();
                System.out.println("");

                String donewithrules = "";

                while (!donewithrules.equalsIgnoreCase("y")) {

                    System.out.println("are you done reading the rules? (y/n)");
                    donewithrules = scan.nextLine();

                    if (donewithrules.equalsIgnoreCase("y")) {

                        emptyScreen();
                        print.printBoard();


                    }
                }


            } else {

                System.out.println("Please Enter a Valid command!");

            }

        }



    }
}
