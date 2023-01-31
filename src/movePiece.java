public class movePiece {
    static String[] whitePieces = new String[6];
    static String[] blackPieces = new String[6];
    public static void movePiece(String from,String to) {

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

        if (from.substring(0,1).equalsIgnoreCase("a") || from.substring(0,1).equalsIgnoreCase("b") || from.substring(0,1).equalsIgnoreCase("c") || from.substring(0,1).equalsIgnoreCase("d") || from.substring(0,1).equalsIgnoreCase("e") || from.substring(0,1).equalsIgnoreCase("f") || from.substring(0,1).equalsIgnoreCase("g") || from.substring(0,1).equalsIgnoreCase("h")) {
            int tempY;
            int tempX;
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

            System.out.println();

        } else {

            System.out.println("Please enter a valid Coordinate. the first coordinate you entered is invalid.");

        }

    }

}
