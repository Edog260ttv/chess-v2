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



    }
}