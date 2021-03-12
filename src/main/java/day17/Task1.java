package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] pieces = new ChessPiece[8];

        pieces[0] = ChessPiece.PAWN_WHITE;
        pieces[1] = ChessPiece.PAWN_WHITE;
        pieces[2] = ChessPiece.PAWN_WHITE;
        pieces[3] = ChessPiece.PAWN_WHITE;
        pieces[4] = ChessPiece.ROOK_BLACK;
        pieces[5] = ChessPiece.ROOK_BLACK;
        pieces[6] = ChessPiece.ROOK_BLACK;
        pieces[7] = ChessPiece.ROOK_BLACK;

        for (ChessPiece piece : pieces) {
            System.out.print(piece + " ");
        }
    }
}