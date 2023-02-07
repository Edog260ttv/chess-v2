import javax.crypto.spec.PSource;

public class print {

    static Main Main = new Main();

    static String[][] board = new String[8][8];

    static String[] whitePieces = new String[6];
    static String[] blackPieces = new String[6];
    static String[] blankSpaces = new String[2];

    static int turnCount = 0;


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

    public static void resetBoard() {

        blankSpaces[0] = "▓▓";
        blankSpaces[1] = "      ";
        //king
        whitePieces[0] = "♔  ";
        //queen
        whitePieces[1] = "♕  ";
        //rook
        whitePieces[2] = "♖  ";
        //Bishop
        whitePieces[3] = "♗  ";
        //Night
        whitePieces[4] = "♘  ";
        //Pawn
        whitePieces[5] = "♙  ";


        blackPieces[0] = "♚  ";
        blackPieces[1] = "♛  ";
        blackPieces[2] = "♜  ";
        blackPieces[3] = "♝  ";
        blackPieces[4] = "♞  ";
        blackPieces[5] = "♟  ";

        Main.setBoard(7, 0, blackPieces[2]);
        Main.setBoard(7, 1, blackPieces[4]);
        Main.setBoard(7, 2, blackPieces[3]);
        Main.setBoard(7, 3, blackPieces[0]);
        Main.setBoard(7, 4, blackPieces[1]);
        Main.setBoard(7, 5, blackPieces[3]);
        Main.setBoard(7, 6, blackPieces[4]);
        Main.setBoard(7, 7, blackPieces[2]);

        Main.setBoard(0,0, whitePieces[2]);
        Main.setBoard(0,1, whitePieces[4]);
        Main.setBoard(0,2, whitePieces[3]);
        Main.setBoard(0,3, whitePieces[0]);
        Main.setBoard(0,4, whitePieces[1]);
        Main.setBoard(0,5, whitePieces[3]);
        Main.setBoard(0,6, whitePieces[4]);
        Main.setBoard(0,7, whitePieces[2]);
//
        for (int j = 0; j < 8; j++) {
            Main.setBoard(1, j, whitePieces[5]);
        }

        for (int j = 0; j < 8; j++) {
            Main.setBoard(6, j, blackPieces[5]);
        }





        for (int i = 5; i >= 2; i--) {

            for (int j = 0; j < 8; j++) {

                if (i % 2 == 0) {

                    if (j % 2 == 0) {

                        Main.setBoard(i, j, blankSpaces[0]);
                    } else if (!(j % 2 == 0)) {
                        Main.setBoard(i, j, blankSpaces[1]);
                    }

                }

                else {

                    if (j % 2 == 0) {
                        Main.setBoard(i, j, blankSpaces[1]);
                    } else if (!(j % 2 == 0)) {
                        Main.setBoard(i, j, blankSpaces[0]);
                    }

                }

            }

        }



        System.out.println("successfully reset Board");

    }

    public static void printBoard() {

        blankSpaces[0] = "▓▓";
        blankSpaces[1] = "      ";
        //king
        whitePieces[0] = "♔  ";
        //queen
        whitePieces[1] = "♕  ";
        //rook
        whitePieces[2] = "♖  ";
        //Bishop
        whitePieces[3] = "♗  ";
        //Night
        whitePieces[4] = "♘  ";
        //Pawn
        whitePieces[5] = "♙  ";


        blackPieces[0] = "♚  ";
        blackPieces[1] = "♛  ";
        blackPieces[2] = "♜  ";
        blackPieces[3] = "♝  ";
        blackPieces[4] = "♞  ";
        blackPieces[5] = "♟  ";

        board = Main.getBoard();



            System.out.println ("    --------------------------");

            for (int i = 7; i >= 0; i--) {
                board = Main.getBoard();

                if (board[i][0].equals(blankSpaces[1])) {
                    System.out.print((i + 1) + "   | ");
                }
                else {
                    System.out.print((i + 1) + "   |  ");
                }

                for (int j = 0; j < 8; j++) {
                    board = Main.getBoard();
                    System.out.print (board[i][j]);
                }

                if (board[i][7].equals(blankSpaces[0])) {
                    System.out.println (" |");
                    board = Main.getBoard();
                }
                else {
                    System.out.println ("|");
                }

            }

            System.out.println ("    --------------------------");
            System.out.println("       A  B  C  D  E  F  G  H");

    }

    public static void flipBoard() {

        blankSpaces[0] = "▓▓";
        blankSpaces[1] = "      ";
        //king
        whitePieces[0] = "♔  ";
        //queen
        whitePieces[1] = "♕  ";
        //rook
        whitePieces[2] = "♖  ";
        //Bishop
        whitePieces[3] = "♗  ";
        //Night
        whitePieces[4] = "♘  ";
        //Pawn
        whitePieces[5] = "♙  ";


        blackPieces[0] = "♚  ";
        blackPieces[1] = "♛  ";
        blackPieces[2] = "♜  ";
        blackPieces[3] = "♝  ";
        blackPieces[4] = "♞  ";
        blackPieces[5] = "♟  ";

        board = Main.getBoard();

        if (turnCount % 2 == 0) {

            System.out.println("    --------------------------");

            for (int i = 0; i <= 7; i++) {
                board = Main.getBoard();

                if (board[i][0].equals(blankSpaces[0])) {
                    System.out.print((i + 1) + "   | ");
                } else {
                    System.out.print((i + 1) + "   |  ");
                }

                for (int j = 7; j >= 0; j--) {
                    board = Main.getBoard();
                    System.out.print(board[i][j]);
                }

                if (board[i][7].equals(blankSpaces[1])) {
                    System.out.println(" |");
                    board = Main.getBoard();
                } else {
                    System.out.println("|");
                }

            }

            System.out.println("    --------------------------");
            System.out.println("       A  B  C  D  E  F  G  H");

        }

        else {

            System.out.println ("    --------------------------");

            for (int i = 7; i >= 0; i--) {
                board = Main.getBoard();

                if (board[i][0].equals(blankSpaces[1])) {
                    System.out.print((i + 1) + "   | ");
                }
                else {
                    System.out.print((i + 1) + "   |  ");
                }

                for (int j = 0; j < 8; j++) {
                    board = Main.getBoard();
                    System.out.print (board[i][j]);
                }

                if (board[i][7].equals(blankSpaces[0])) {
                    System.out.println (" |");
                    board = Main.getBoard();
                }
                else {
                    System.out.println ("|");
                }

            }

            System.out.println ("    --------------------------");
            System.out.println("       A  B  C  D  E  F  G  H");

        }

        turnCount++;

    }

    public static void main(String[] args) {

        //reset the board to its original state
        resetBoard();
        //print the current board
        printBoard();
        System.out.println();

        //invert the current board (twice)
        flipBoard();
        System.out.println();
        flipBoard();

    }

}


