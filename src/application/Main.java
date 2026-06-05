package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMatch);

                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(scanner);
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(scanner);

                chessMatch.performChessMove(source, target);
            }
            catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }


    }
}
