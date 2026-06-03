package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    protected void increaseMoveCount() {
        moveCount++;
    }
    protected void decreaseMoveCount() {
        moveCount--;
    }
    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public boolean isThereOpponentPiece (Position position) {
        ChessPiece aux = (ChessPiece) getBoard().piece(position);
        return aux != null && aux.getColor() != color;
    }

}
