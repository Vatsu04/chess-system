/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardgame;


public class Board {

  
    public int getRows() {
        return rows;
    }

    
    public void setRows(int rows) {
        this.rows = rows;
    }

   
    public int getColumns() {
        return columns;
    }

   
    public void setColumns(int columns) {
        this.columns = columns;
    }
    private Piece[][] pieces;
    private int rows;
    private int columns;
    
    
    
    public Board(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }
}
