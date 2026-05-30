package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            ChessPosition source = UI.readChessPosition(scanner);
            ChessPosition target = UI.readChessPosition(scanner);

            chessMatch.performChessMove(source, target);
        }


    }
}
