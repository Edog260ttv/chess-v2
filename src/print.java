public class print {

    static String[][] board = new String[8][8];

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
    public static void resetBoard() {

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

        board[0][0] = whitePieces[2];
        board[0][1] = whitePieces[4];
        board[0][2] = whitePieces[3];
        board[0][3] = whitePieces[0];
        board[0][4] = whitePieces[1];
        board[0][5] = whitePieces[3];
        board[0][6] = whitePieces[4];
        board[0][7] = whitePieces[2];

        System.out.println("    --------------------------");
        System.out.println("8   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
        System.out.println("7   |▓▓    ▓▓    ▓▓    ▓▓    |");
        System.out.println("6   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
        System.out.println("5   |▓▓    ▓▓    ▓▓    ▓▓    |");
        System.out.println("4   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
        System.out.println("3   |▓▓    ▓▓    ▓▓    ▓▓    |");
        System.out.println("2   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
        System.out.println("1   | " + board[0][0] + "  " + board[0][1] + "  " + board[0][2] + "   " + board[0][3] + "  " + board[0][4] + "   " + board[0][5] + "  " + board[0][6] + "|");
        System.out.println("    --------------------------");
        System.out.println("      A  B  C  D  E  F  G  H");

    }


}
