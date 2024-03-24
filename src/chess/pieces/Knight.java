package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;
import boardgame.Position;

public class Knight extends ChessPiece {
    public Knight(Board board, Color color){
        super(board,color);
    }
    
    @Override
    public String toString(){
        return "H";
    }
    
    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        int[][] possibleOffsets = {{-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}};

        for (int[] offset : possibleOffsets) {
            int row = position.getRow() + offset[0];
            int col = position.getColumn() + offset[1];
            Position newPos = new Position(row, col);

            if (getBoard().positionExists(newPos) && canMove(newPos)) {
                mat[row][col] = true;
            }
        }

        return mat;
    }
  
}
