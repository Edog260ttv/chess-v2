public class move {

    static Main Main = new Main();
    static String[] whitePieces = new String[6];
    static String[] blackPieces = new String[6];

    static String[][] board = new String[8][8];
    static String piece = "";
    public static void movePiece(String from,String to) {


        //Get Board
        board = Main.getBoard();

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


        // is the coordinate they entered valid?
        if (((from.substring(0,1).equalsIgnoreCase("a") || from.substring(0,1).equalsIgnoreCase("b") || from.substring(0,1).equalsIgnoreCase("c") || from.substring(0,1).equalsIgnoreCase("d") || from.substring(0,1).equalsIgnoreCase("e") || from.substring(0,1).equalsIgnoreCase("f") || from.substring(0,1).equalsIgnoreCase("g") || from.substring(0,1).equalsIgnoreCase("h")) && (to.substring(0,1).equalsIgnoreCase("a") || to.substring(0,1).equalsIgnoreCase("b") || to.substring(0,1).equalsIgnoreCase("c") || to.substring(0,1).equalsIgnoreCase("d") || to.substring(0,1).equalsIgnoreCase("e") || to.substring(0,1).equalsIgnoreCase("f") || to.substring(0,1).equalsIgnoreCase("g") || to.substring(0,1).equalsIgnoreCase("h"))) && (to.length() < 3 && to.length() > 1 && from.length() < 3 && from.length() > 1) ) {
            int tempY = 0;
            int tempX = 0;
            if (from.substring(0,1).equalsIgnoreCase("a")) {

                tempX = 1;
                tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("b")) {

                tempX = 2;
                tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("c")) {

                tempX = 3;
                tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("d")) {

                tempX = 4;
                tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("e")) {

                tempX = 5;
                tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("f")) {

                tempX = 6;
                tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("g")) {

                tempX = 7;
                tempY = Integer.parseInt(from.substring(1));

            } else if (from.substring(0,1).equalsIgnoreCase("h")) {

                tempX = 8;
                tempY = Integer.parseInt(from.substring(1));

            }


            int tempY2 = 0;
            int tempX2 = 0;
            if (to.substring(0, 1).equalsIgnoreCase("a")) {

                tempX2 = 1;
                tempY2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("b")) {

                tempX2 = 2;
                tempY2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("c")) {

                tempX2 = 3;
                tempY2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("d")) {

                tempX2 = 4;
                tempY2 = Integer.parseInt(to.substring(1));

               } else if (to.substring(0, 1).equalsIgnoreCase("e")) {

                tempX2 = 5;
                tempY2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("f")) {

                tempX2 = 6;
                tempY2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("g")) {

                tempX2 = 7;
                tempY2 = Integer.parseInt(to.substring(1));

            } else if (to.substring(0, 1).equalsIgnoreCase("h")) {

                tempX2 = 8;
                tempY2 = Integer.parseInt(to.substring(1));

            }


                piece = board[tempX][tempY];
                // coordinate they entered is valid
                System.out.println("move" + piece +  " from " + tempX + "," + tempY + " to " + tempX2 + "," + tempY2);







        } else {


            // coordinated they entered is invalid
            System.out.println("Please enter a valid Coordinate. one or more of the coordinates you entered is invalid!");

        }

    }

}
