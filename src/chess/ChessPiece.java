
package chess;


import boardgame.Piece;
import boardgame.Board;


public class ChessPiece extends Piece {

   
    public Color getColor() {
        return color;
    }
    
    private Color color;
    
    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }
}
