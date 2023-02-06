public class Main {

   static String[][] board = new String[8][8];

    static String[] whitePieces = new String[6];
    static String[] blackPieces = new String[6];
    static String[] blankSpaces = new String[2];

    //king

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
        Main.setBoard(7, 1, blackPieces[2]);
        Main.setBoard(7, 2, blackPieces[2]);
        Main.setBoard(7, 3, blackPieces[2]);
        Main.setBoard(7, 4, blackPieces[2]);
        Main.setBoard(7, 5, blackPieces[2]);
        Main.setBoard(7, 6, blackPieces[2]);
        Main.setBoard(7, 7, blackPieces[2]);

        Main.setBoard(0,0, whitePieces[2]);
        Main.setBoard(0,1, whitePieces[2]);
        Main.setBoard(0,2, whitePieces[2]);
        Main.setBoard(0,3, whitePieces[2]);
        Main.setBoard(0,4, whitePieces[2]);
        Main.setBoard(0,5, whitePieces[2]);
        Main.setBoard(0,6, whitePieces[2]);
        Main.setBoard(0,7, whitePieces[2]);

        board = Main.getBoard();



        for (int j = 0; j < 8; j++) {
            Main.setBoard(j,6, blackPieces[5]);
        }

        for (int i = 5; i >= 2; i--) {

            for (int j = 0; j < 8; j++) {

                if (i % 2 == 0) {

                    if (j % 2 == 0) {
//                        board[i][j] = blankSpaces[0];
                        Main.setBoard(i, j, blankSpaces[0]);
                    } else if (!(j % 2 == 0)) {
//                        board[i][j] = blankSpaces[1];
                        Main.setBoard(i, j, blankSpaces[1]);
                    }

                }

                else {

                    if (j % 2 == 0) {
//                        board[i][j] = blankSpaces[1];
                        Main.setBoard(i, j, blankSpaces[1]);
                    } else if (!(j % 2 == 0)) {
//                        board[i][j] = blankSpaces[0];
                        Main.setBoard(i, j, blankSpaces[0]);
                    }

                }

            }

        }

        for (int j = 0; j < 8; j++) {
            Main.setBoard(j, 6, whitePieces[5]);
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

        for (int i = 7; i > 0; i--) {

            System.out.print ((i + 1) + "   |  ");

            for (int j = 0; j < 8; j++) {
                System.out.print (board[i][j]);
            }

            if (board[i][7].equals(blankSpaces[0]) || board[i][7].equals(blankSpaces[1])) {
                System.out.println ("ksajdas");
            }

            else {
                System.out.println ("|");
            }

        }

    }

    public static void main(String[] args){

        whitePieces[0] = "  ♔";
        //queen
        whitePieces[1] = "  ♕";
        //rook
        whitePieces[2] = "  ♖";
        //Bishop
        whitePieces[3] = "  ♗";
        //Night
        whitePieces[4] = "  ♘";
        //Pawn
        whitePieces[5] = "  ♙";


        blackPieces[0] = "  ♚";
        blackPieces[1] = "  ♛";
        blackPieces[2] = "  ♜";
        blackPieces[3] = "  ♝";
        blackPieces[4] = "  ♞";
        blackPieces[5] = "  ♟";

        blankSpaces[0] = "▓▓";
        blankSpaces[1] = "      ";

        resetBoard();
        printBoard();

//        board[0][0] = whitePieces[2];
//        board[0][1] = whitePieces[4];
//        board[0][2] = whitePieces[3];
//        board[0][3] = whitePieces[0];
//        board[0][4] = whitePieces[1];
//        board[0][5] = whitePieces[3];
//        board[0][6] = whitePieces[4];
//        board[0][7] = whitePieces[2];
//
//        System.out.println("    --------------------------");
//        System.out.println("8   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
//        System.out.println("7   |▓▓    ▓▓    ▓▓    ▓▓    |");
//        System.out.println("6   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
//        System.out.println("5   |▓▓    ▓▓    ▓▓    ▓▓    |");
//        System.out.println("4   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
//        System.out.println("3   |▓▓    ▓▓    ▓▓    ▓▓    |");
//        System.out.println("2   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
//        System.out.println("1   | " + board[0][0] + "  " + board[0][1] + "  " + board[0][2] + "   " + board[0][3] + "  " + board[0][4] + "   " + board[0][5] + "  " + board[0][6] + "|");
//        System.out.println("    --------------------------");
//        System.out.println("      A  B  C  D  E  F  G  H");

    }
}


