package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {
    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }

    private boolean canMove (Position position) {
        ChessPiece aux = (ChessPiece) getBoard().piece(position);
        return aux == null || aux.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] aux = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);
        //above right
        p.setValues(position.getRow() - 2, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //above left
        p.setValues(position.getRow() - 2, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //down right
        p.setValues(position.getRow() + 2, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //down left
        p.setValues(position.getRow() + 2, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //right down
        p.setValues(position.getRow() + 1, position.getColumn() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //right above
        p.setValues(position.getRow() - 1, position.getColumn() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //left down
        p.setValues(position.getRow() + 1, position.getColumn() - 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        //left above
        p.setValues(position.getRow() - 1, position.getColumn() - 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        return aux;
    }
}
