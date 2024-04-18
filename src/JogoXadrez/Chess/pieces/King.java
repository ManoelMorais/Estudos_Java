package JogoXadrez.Chess.pieces;

import JogoXadrez.Chess.ChessPiece;
import JogoXadrez.Chess.Color;
import JogoXadrez.boardgame.Board;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
