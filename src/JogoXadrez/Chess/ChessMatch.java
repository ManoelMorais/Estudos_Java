package JogoXadrez.Chess;

import JogoXadrez.Chess.pieces.King;
import JogoXadrez.Chess.pieces.Rook;
import JogoXadrez.boardgame.Board;
import JogoXadrez.boardgame.Position;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i< board.getRows(); i++){
            for (int j=0; j< board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    private void PlaceNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        PlaceNewPiece('b', 6, new Rook(board, Color.WHITE));
        PlaceNewPiece('a', 5, new King(board, Color.BLACK));
        PlaceNewPiece('g', 3, new King(board, Color.WHITE));
    }
}
