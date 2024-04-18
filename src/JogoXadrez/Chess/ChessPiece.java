package JogoXadrez.Chess;

import JogoXadrez.boardgame.Board;
import JogoXadrez.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
