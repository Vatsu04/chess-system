
package chess.system;

import boardgame.Position;
import java.util.Scanner;
import boardgame.Board;
import chess.ChessMatch;

public class ChessSystem {

 
    public static void main(String[] args) {
     
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        
    }
    
}
