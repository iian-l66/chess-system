package chess;

import boardgame.Board;

public class ChessMatch {
    private Board board;
    private int turn;
    private Color currentPlayer;
    private boolean check;

    public ChessMatch() {
        this.board = new Board(8, 8);
    }
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
