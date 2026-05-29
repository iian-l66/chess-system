package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 0 || rows > 8 || columns < 0 || columns > 8) {
            throw new BoardException("Error: Invalid board size");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Piece piece (int row,  int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Error: invalid position");
        }
        return pieces[row][column];
    }

    public Piece piece (Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Error: invalid position");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece (Piece piece, Position position) {
        if (!thereIsAPiece(position)) {
            throw new BoardException("Error: There is no piece in that position");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public boolean positionExists (int row, int column) {
        return row >= 0 && row < rows && column >=0 && column < columns;
    }

    public boolean positionExists (Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public  boolean thereIsAPiece (Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Error: invalid position");
        }
        return pieces[position.getRow()][position.getColumn()] != null;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }


}
