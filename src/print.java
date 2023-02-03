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

        board[7][0] = blackPieces[2];
        board[7][1] = blackPieces[4];
        board[7][2] = blackPieces[3];
        board[7][3] = blackPieces[0];
        board[7][4] = blackPieces[1];
        board[7][5] = blackPieces[3];
        board[7][6] = blackPieces[4];
        board[7][7] = blackPieces[2];

        board[0][0] = whitePieces[2];
        board[0][1] = whitePieces[4];
        board[0][2] = whitePieces[3];
        board[0][3] = whitePieces[0];
        board[0][4] = whitePieces[1];
        board[0][5] = whitePieces[3];
        board[0][6] = whitePieces[4];
        board[0][7] = whitePieces[2];

        System.out.println ("    --------------------------");
        System.out.println("8   |" + board[7][0] + board[7][1] +  board[7][2] + board[7][3] + board[7][4] + board[7][5] + board[7][6] + board[7][7] + " |");   //black pieces
        System.out.print ("7   |");   //start of black pawn line

        for (int j = 0; j < 8; j++) {
            board[j][6] = blackPieces[5];
            System.out.print (board[j][6]);
        }
        System.out.println(" |");

        for (int i = 5; i >= 2; i--) {

            for (int j = 0; j < 8; j++) {

                if (i % 2 == 0) {

                    if (j % 2 == 0) {
                        board[i][j] = blankSpaces[0];
                    } else if (!(j % 2 == 0)) {
                        board[i][j] = blankSpaces[1];
                    }

                }

                else {

                    if (j % 2 == 0) {
                        board[i][j] = blankSpaces[1];
                    } else if (!(j % 2 == 0)) {
                        board[i][j] = blankSpaces[0];
                    }

                }

            }

        }
        //prints blank spaces at the beginning of the match
        System.out.println("6   | " + board[5][0] + board[5][1] +  board[5][2] + board[5][3] + board[5][4] + board[5][5] + board[5][6] + board[5][7]);
        System.out.println("5   |  " + board[4][0] + board[4][1] +  board[4][2] + board[4][3] + board[4][4] + board[4][5] + board[4][6] + board[4][7]);
        System.out.println("4   | " + board[3][0] + board[3][1] +  board[3][2] + board[3][3] + board[3][4] + board[3][5] + board[3][6] + board[3][7]);
        System.out.println("3   |  " + board[2][0] + board[2][1] +  board[2][2] + board[2][3] + board[2][4] + board[2][5] + board[2][6] + board[2][7]);

        System.out.print ("2   |");   //start of white pawn line

        for (int j = 0; j < 8; j++) {
            board[j][6] = whitePieces[5];
            System.out.print (board[j][6]);
        }
        System.out.println(" |");

        System.out.println("1   |" + board[0][0] + board[0][1] +  board[0][2] + board[0][3] + board[0][4] + board[0][5] + board[0][6] + board[0][7] + " |");   //white pieces
        System.out.println ("    --------------------------");
        System.out.println("      A  B  C  D  E  F  G  H");

    }
        
        
        
//         board[0][0] = whitePieces[2];
//         board[0][1] = whitePieces[4];
//         board[0][2] = whitePieces[3];
//         board[0][3] = whitePieces[0];
//         board[0][4] = whitePieces[1];
//         board[0][5] = whitePieces[3];
//         board[0][6] = whitePieces[4];
//         board[0][7] = whitePieces[2];

//         System.out.println("    --------------------------");
//         System.out.println("8   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
//         System.out.println("7   |▓▓    ▓▓    ▓▓    ▓▓    |");
//         System.out.println("6   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
//         System.out.println("5   |▓▓    ▓▓    ▓▓    ▓▓    |");
//         System.out.println("4   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
//         System.out.println("3   |▓▓    ▓▓    ▓▓    ▓▓    |");
//         System.out.println("2   |   ▓▓    ▓▓    ▓▓    ▓▓ |");
//         System.out.println("1   | " + board[0][0] + "  " + board[0][1] + "  " + board[0][2] + "   " + board[0][3] + "  " + board[0][4] + "   " + board[0][5] + "  " + board[0][6] + "|");
//         System.out.println("    --------------------------");
//         System.out.println("      A  B  C  D  E  F  G  H");

    }


}
