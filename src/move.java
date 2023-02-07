public class move {

    static Main Main = new Main();

    static boolean moveIsValid = false;

    static boolean ownsPiece = false;
    static boolean turnIsComplete = false;

    static String[] whitePieces = new String[6];
    static String[] blackPieces = new String[6];
    static String[] blankSpaces = new String[2];

    static String[][] board = new String[8][8];
    static String piece = "";
    static int whosTurn;
    public static void movePiece(String from,String to) {

        whosTurn = Main.getWhosTurn();
        //Get Board
        board = Main.getBoard();


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


        // is the coordinate they entered valid?
        if (((from.substring(0, 1).equalsIgnoreCase("a") || from.substring(0, 1).equalsIgnoreCase("b") || from.substring(0, 1).equalsIgnoreCase("c") || from.substring(0, 1).equalsIgnoreCase("d") || from.substring(0, 1).equalsIgnoreCase("e") || from.substring(0, 1).equalsIgnoreCase("f") || from.substring(0, 1).equalsIgnoreCase("g") || from.substring(0, 1).equalsIgnoreCase("h")) && (to.substring(0, 1).equalsIgnoreCase("a") || to.substring(0, 1).equalsIgnoreCase("b") || to.substring(0, 1).equalsIgnoreCase("c") || to.substring(0, 1).equalsIgnoreCase("d") || to.substring(0, 1).equalsIgnoreCase("e") || to.substring(0, 1).equalsIgnoreCase("f") || to.substring(0, 1).equalsIgnoreCase("g") || to.substring(0, 1).equalsIgnoreCase("h"))) && (to.length() < 3 && to.length() > 1 && from.length() < 3 && from.length() > 1) && !(to.substring(1).equalsIgnoreCase("9")) && !(from.substring(1).equalsIgnoreCase("9")) && !from.substring(1).equalsIgnoreCase("0") && !to.substring(1).equalsIgnoreCase("0")) {
            int tempY = 0;
            int tempX = 0;
            if (from.substring(0, 1).equalsIgnoreCase("a")) {

                tempY = 1;
                tempX = Integer.parseInt(from.substring(1));

            } else if (from.substring(0, 1).equalsIgnoreCase("b")) {

                tempY = 2;
                tempX = Integer.parseInt(from.substring(1));

            } else if (from.substring(0, 1).equalsIgnoreCase("c")) {

                tempY = 3;
                tempX = Integer.parseInt(from.substring(1));

            } else if (from.substring(0, 1).equalsIgnoreCase("d")) {

                tempY = 4;
                tempX = Integer.parseInt(from.substring(1));

            } else if (from.substring(0, 1).equalsIgnoreCase("e")) {

                tempY = 5;
                tempX = Integer.parseInt(from.substring(1));

            } else if (from.substring(0, 1).equalsIgnoreCase("f")) {

                tempY = 6;
                tempX = Integer.parseInt(from.substring(1));

            } else if (from.substring(0, 1).equalsIgnoreCase("g")) {

                tempY = 7;
                tempX = Integer.parseInt(from.substring(1));

            } else if (from.substring(0, 1).equalsIgnoreCase("h")) {

                tempY = 8;
                tempX = Integer.parseInt(from.substring(1));

            }


            int tempY2 = 0;
            int tempX2 = 0;
            if (to.substring(0, 1).equalsIgnoreCase("a")) {

                tempY2 = 1;
                tempX2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("b")) {

                tempY2 = 2;
                tempX2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("c")) {

                tempY2 = 3;
                tempX2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("d")) {

                tempY2 = 4;
                tempX2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("e")) {

                tempY2 = 5;
                tempX2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("f")) {

                tempY2 = 6;
                tempX2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("g")) {

                tempY2 = 7;
                tempX2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("h")) {

                tempY2 = 8;
                tempX2 = Integer.parseInt(to.substring(1));

            }

            tempY2--;
            tempY--;
            tempX--;
            tempX2--;


            piece = board[tempX][tempY];
            // coordinate they entered is valid
            System.out.println("move   " + piece + " from " + tempX + "," + tempY + " to " + tempX2 + "," + tempY2);


            // checking if player owns the piece they are trying to move
            if (whosTurn == 1) {


                if (piece == null) {

                    System.out.println("board has yet to be set up, so this piece is null");

                } else if (piece.equalsIgnoreCase(whitePieces[0]) || piece.equalsIgnoreCase(whitePieces[1]) || piece.equalsIgnoreCase(whitePieces[2]) || piece.equalsIgnoreCase(whitePieces[3]) || piece.equalsIgnoreCase(whitePieces[4]) || piece.equalsIgnoreCase(whitePieces[5]) || piece.equalsIgnoreCase(whitePieces[6]) || piece.equalsIgnoreCase(whitePieces[7])) {

                    ownsPiece = true;

                } else {

                    System.out.println("Please pick another Piece, you don't own this one");

                }

            }

            System.out.println("you own this piece");


            //moving checking if it's a valid move
            if (ownsPiece) {

                moveIsValid =  isValidMove(piece, tempX, tempY, tempX2, tempY2);

                if (moveIsValid) {

                    Main.setBoard(tempX2, tempY2, piece);
                    Main.setBoard(tempX, tempY, blankSpaces[1]);
                    System.out.println("to " + tempX2 + "," + tempY2 + " piece " + piece);
                    System.out.println("from " + tempX + "," + tempY);

                }

            }

//            turnIsComplete = true;

        } else {


            // coordinated they entered is invalid
            System.out.println("Please enter a valid Coordinate. one or more of the coordinates you entered is invalid!");

        }




        if (turnIsComplete) {
            //changing turns and flipping board
            if (whosTurn == 1) {

                Main.setWhosTurn(2);
                Main.flipBoard();

            } else {

                Main.setWhosTurn(1);
                Main.flipBoard();

            }
        }
    }


    public static boolean isValidMove(String piece, int x1, int y1, int x2, int y2) {




        System.out.println("the isValidMove Method has yet to be implemented, will return false by default.");

        // if piece is ___ piece, black or white, then test where it can move legall.

        if (turnIsComplete) {
            //changing turns and flipping board
            if (whosTurn == 1) {

                // King`
                if (piece.equalsIgnoreCase(whitePieces[0]) || piece.equalsIgnoreCase(blackPieces[0])) {

                    if ((x2 == x1 + 1 || x2 == x1 - 1) || (y2 == y1 + 1 || y2 == y1 - 1)) {
                        // finish the IFS!
                        return true;

                    } else {

                        System.out.println("your King Cannot Move there!");

                    }

                }



            } else {

                System.out.println("second players turn");

            }
        }


        System.out.println(" returned false");
        return false;

    }

}
