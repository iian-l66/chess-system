package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    private boolean canMove (Position position) {
        ChessPiece aux = (ChessPiece) getBoard().piece(position);
        return aux == null || aux.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] aux = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);
        //above
        p.setValues(position.getRow() - 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //left
        p.setValues(position.getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //right
        p.setValues(position.getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //down
        p.setValues(position.getRow() + 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //right above
        p.setValues(position.getRow() - 1, position.getColumn() +1);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //left above
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //down right
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //down left
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }

        return aux;
    }
}
