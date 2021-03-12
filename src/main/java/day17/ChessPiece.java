package day17;

public enum ChessPiece {
    PAWN_WHITE(1d, "♙"),
    KNIGHT_WHITE(3d, "♘"),
    BISHOP_WHITE(3.5d, "♗"),
    ROOK_WHITE(5d, "♖"),
    QUEEN_WHITE(9d, "♕"),
    KING_WHITE(100d, "♔"),

    PAWN_BLACK(1d, "♟"),
    KNIGHT_BLACK(3d, "♞"),
    BISHOP_BLACK(3.5d, "♝"),
    ROOK_BLACK(5d, "♜"),
    QUEEN_BLACK(9d, "♛"),
    KING_BLACK(100d, "♚"),

    EMPTY(-1d, "_");

    private double value;
    private String icon;

    ChessPiece(double value, String icon) {
        this.value = value;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return icon;
    }
}
