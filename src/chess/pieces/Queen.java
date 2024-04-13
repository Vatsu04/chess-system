package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;
import boardgame.Position;

public class Queen extends ChessPiece {
    public Queen(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString() {
        return "Q";
    }
    
    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0, 0);
        
        // Horizontal and Vertical movements
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i != 0 || j != 0) { // excluding the current position
                    p.setValues(position.getRow() + i, position.getColumn() + j);
                    while (getBoard().positionExists(p) && canMove(p)) {
                        mat[p.getRow()][p.getColumn()] = true;
                        if (getBoard().thereIsAPiece(p)) {
                            break;
                        }
                        p.setValues(p.getRow() + i, p.getColumn() + j);
                    }
                }
            }
        }
        
        return mat;
    }
}
