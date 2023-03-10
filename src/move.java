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
            int tempX = 0;
            int tempY = 0;

            // converting from to two ints as coordinates
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


            int tempX2 = 0;
            int tempY2 = 0;
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

            board = Main.getBoard();
            piece = board[tempX][tempY];
            // coordinate they entered is valid
            System.out.println("move " + piece + " from " + (tempY + 1) + "," + (tempX+ 1) + " to " + (tempY2 + 1) + "," + (tempX2 + 1));


            // checking if player owns the piece they are trying to move
            if (whosTurn == 1) {


                if (piece == null) {

                    System.out.println("board has yet to be set up, so this piece is null");

                } else if (piece.equalsIgnoreCase(whitePieces[0]) || piece.equalsIgnoreCase(whitePieces[1]) || piece.equalsIgnoreCase(whitePieces[2]) || piece.equalsIgnoreCase(whitePieces[3]) || piece.equalsIgnoreCase(whitePieces[4]) || piece.equalsIgnoreCase(whitePieces[5]) && !piece.equalsIgnoreCase(blankSpaces[1]) && !piece.equalsIgnoreCase(blackPieces[0])) {

                    ownsPiece = true;

                } else {

                    System.out.println("Please pick another Piece, you don't own this one");

                }

            } else {

                if (piece == null) {

                    System.out.println("board has yet to be set up, so this piece is null");

                } else if (piece.equalsIgnoreCase(blackPieces[0]) || piece.equalsIgnoreCase(blackPieces[1]) || piece.equalsIgnoreCase(blackPieces[2]) || piece.equalsIgnoreCase(blackPieces[3]) || piece.equalsIgnoreCase(blackPieces[4]) || piece.equalsIgnoreCase(blackPieces[5]) && !piece.equalsIgnoreCase(blankSpaces[1]) && !piece.equalsIgnoreCase(blackPieces[0])) {

                    ownsPiece = true;

                } else {

                    System.out.println("Please pick another Piece, you don't own this one");
                    ownsPiece = false;

                }

            }



            //moving checking if it's a valid move
            if (ownsPiece) {

                moveIsValid =  isValidMove(piece, tempY, tempX, tempY2, tempX2);

                if (moveIsValid) {
                    System.out.println("move is valid");

                    if ((tempX % 2 == 0 && tempY % 2 == 0) || (tempX % 2 == 1 && tempY % 2 == 1)) {
                        Main.setBoard(tempX, tempY, blankSpaces[0]);
                    } else {
                        Main.setBoard(tempX, tempY, blankSpaces[1]);
                    }


                    Main.setBoard(tempX2, tempY2, piece);
                    System.out.println("to " + tempX2 + "," + tempY2 + " piece " + piece);
                    System.out.println("from " + tempX + "," + tempY);
                    turnIsComplete = true;

                } else {

                    System.out.println("Move is invalid");

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
                print.flipBoard();

            } else {

                Main.setWhosTurn(1);
                print.flipBoard();

            }

            turnIsComplete = false;

        }
    }


    public static boolean isValidMove(String piece, int x1, int y1, int x2, int y2) {

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

        if (piece.equalsIgnoreCase(whitePieces[1]) || piece.equalsIgnoreCase(blackPieces[1])) {

            System.out.println("the piece is a queen");

        } else if (piece.equalsIgnoreCase(whitePieces[0]) || piece.equalsIgnoreCase(blackPieces[0])) {


            System.out.println("this piece is a king");

        } else if (piece.equalsIgnoreCase(whitePieces[2]) || piece.equalsIgnoreCase(blackPieces[2])) {


            System.out.println("this piece is a rook");

        } else if (piece.equalsIgnoreCase(whitePieces[3]) || piece.equalsIgnoreCase(blackPieces[3])) {


            System.out.println("this piece is a bishop");

        } else if (piece.equalsIgnoreCase(whitePieces[4]) || piece.equalsIgnoreCase(blackPieces[4])) {


            System.out.println("this piece is a Knight");

            if ((y2 == (y1 + 2) && x2 == (x1 + 1)) || (y2 == (y1 + 1) && x2 == (x1 + 2)) || (y2 == (y1 - 1) && x2 == (x1 + 2)) || (y2 == (y1 - 2) && x2 == (x1 + 1)) || (y2 == (y1 - 2) && x2 == (x1 - 1)) || (y2 == (y1 - 1) && x2 == (x1 - 2)) || (y2 == (y1 + 1) && x2 == (x1 - 2)) || (y2 == (y1 + 2) && x2 == (x1 - 1))) {

                if (canCapture(x2, y2)) {

                    //checks if the knight moves in an L shape
                    return true;

                }

            } else {

                System.out.println("this is an illegal move");
                return false;

            }

        } else if (piece.equalsIgnoreCase(whitePieces[5]) || piece.equalsIgnoreCase(blackPieces[5])) {


            System.out.println("this piece is a pawn");

            if (piece.equals(whitePieces[5]) && (x2 == x1 && y2 == (y1 + 1))) {

                if (canCapture(x2, y2)) {

                    //checks if the white pawn is only moving one space forward
                    return true;

                }

            } else if (piece.equals(whitePieces[5]) && (x2 == x1 && y2 == (y1 + 2) && y1 == 1)) {

                if (canCapture(x2, y2)) {

                    //checks if the white pawn is in its starting position, letting it move two spaces
                    return true;

                }

            } else if (piece.equals(whitePieces[5]) && (board[x2][y2].equals(blackPieces[0]) || board[x2][y2].equals(blackPieces[1]) || board[x2][y2].equals(blackPieces[2]) || board[x2][y2].equals(blackPieces[3]) || board[x2][y2].equals(blackPieces[4]) || board[x2][y2].equals(blackPieces[5])) && (x2 == (x1 + 1) && (y2 == y1 + 1))) {

                if (canCapture(x2, y2)) {

                    //lets a white pawn move diagonally to the right to take an enemy piece
                    return true;

                }

            } else if (piece.equals(whitePieces[5]) && (board[x2][y2].equals(blackPieces[0]) || board[x2][y2].equals(blackPieces[1]) || board[x2][y2].equals(blackPieces[2]) || board[x2][y2].equals(blackPieces[3]) || board[x2][y2].equals(blackPieces[4]) || board[x2][y2].equals(blackPieces[5])) && (x2 == (x1 - 1) && (y2 == y1 + 1))) {

                if (canCapture(x2, y2)) {

                    //lets a white pawn move diagonally to the left to take an enemy piece
                    return true;

                }

            } else if (piece.equals(whitePieces[5]) && (y2 == 7)) {

                if (canCapture(x2, y2)) {

                    //player can promote a white pawn if it reaches the other end of the board


                }

            } else if (piece.equals(blackPieces[5]) && (x2 == x1 && y2 == (y1 - 1))) {

                if (canCapture(x2, y2)) {

                    //checks if the black pawn is only moving one space forward
                    return true;

                }

            } else if (piece.equals(blackPieces[5]) && (x2 == x1 && y2 == (y1 - 2) && y1 == 6)) {

                if (canCapture(x2, y2)) {

                    //checks if the black pawn is in its starting position, letting it move two spaces
                    return true;

                }

            } else if (piece.equals(blackPieces[5]) && (board[x2][y2].equals(whitePieces[0]) || board[x2][y2].equals(whitePieces[1]) || board[x2][y2].equals(whitePieces[2]) || board[x2][y2].equals(whitePieces[3]) || board[x2][y2].equals(whitePieces[4]) || board[x2][y2].equals(whitePieces[5])) && (x2 == (x1 + 1) && (y2 == y1 - 1))) {

                if (canCapture(x2, y2)) {

                    //lets a black pawn move diagonally to the right to take an enemy piece
                    return true;

                }

            } else if (piece.equals(blackPieces[5]) && (board[x2][y2].equals(whitePieces[0]) || board[x2][y2].equals(whitePieces[1]) || board[x2][y2].equals(whitePieces[2]) || board[x2][y2].equals(whitePieces[3]) || board[x2][y2].equals(whitePieces[4]) || board[x2][y2].equals(whitePieces[5])) && (x2 == (x1 - 1) && (y2 == y1 - 1))) {

                if (canCapture(x2, y2)) {

                    //lets a black pawn move diagonally to the left to take an enemy piece
                    return true;

                }

            }

            else {

                System.out.println("this is an illegal move");
                return false;

            }

        }

        System.out.println("returned false by default");
        return false;

    }

    public static boolean canCapture (int y2, int x2) {

        if (whosTurn == 1 && (!(board[x2][y2].equals(whitePieces[0])) && !(board[x2][y2].equals(whitePieces[1])) && !(board[x2][y2].equals(whitePieces[2])) && !(board[x2][y2].equals(whitePieces[3])) && !(board[x2][y2].equals(whitePieces[4])) && !(board[x2][y2].equals(whitePieces[5])))) {

            return true;

        } else if (whosTurn == 2 && (!(board[x2][y2].equals(blackPieces[0])) && !(board[x2][y2].equals(blackPieces[1])) && !(board[x2][y2].equals(blackPieces[2])) && !(board[x2][y2].equals(blackPieces[3])) && !(board[x2][y2].equals(blackPieces[4]) && !(board[x2][y2].equals(blackPieces[5]))))) {

            return true;

        } else {

            System.out.println("you can't capture your own piece");
            return false;

        }

    }

}
