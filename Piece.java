public enum Piece {
    whitePawn (1, 'w'),
    whiteKnight(3, 'w'),
    whiteBishop(3, 'w'),
    whiteRook(5, 'w'),
    whiteQueen(9, 'w'),
    whiteKing(Integer.MAX_VALUE, 'w'),

    blackPawn (-1, 'b'),
    blackKnight(-3, 'b'),
    blackBishop(-3, 'b'),
    blackRook(-5, 'b'),
    blackQueen(-9, 'b'),
    blackKing(Integer.MIN_VALUE, 'b'),

    empty(0, 'n');


    private final int value;
    private final char color;
    Piece(int value, char color)
    {
        this.value=value;
        this.color = color;
    }
    public int getValue() {return value;}
    public char getColor(){return color;}
}
