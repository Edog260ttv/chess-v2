import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

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
    public static void main(String[] args) {



        // important variables
        Scanner scan = new Scanner(System.in);
        String[] playerNames = new String[2];
        String userInput = "";
        String[] board = new String[64];

        //Chess Pieces
        String[] whitePieces = new String[6];
        String[] blackPieces = new String[6];

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
        System.out.println(blackPieces[1]);



    }
}