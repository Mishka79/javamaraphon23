package day17;

public enum ChessPiece {
    KING_WHITE("\u2654", 100), KING_BLACK("♚", 100), QUEEN_WHITE("\u2655", 9),
    QUEEN_BLACK("\u265B", 9), ROOK_WHITE("\u2656", 5), ROOK_BLACK("\u265C", 5),
    BISHOP_WHITE("\u2657", 3.5), BISHOP_BLACK("\u265D", 3.5), KHIGHT_WHITE("\u2658", 3),
    KNIGHT_BLACK("\u265E", 3), PAWN_WHITE("\u2659", 1), PAWN_BLACK("\u265F", 1),
    EMPTY("_", -1);
    private double price;
    private String name;

    private ChessPiece(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
