package day17;

public class ChessBoard {
    public final static int N_LINES = 8;
    public final static int N_RAWS = 8;
    ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print() {
        for (int i = 0; i < N_LINES; i++) {
            for (int j = 0; j < N_RAWS; j++) {
                System.out.print(chessPieces[i][j]);
            }
            System.out.println();
        }
    }
}
