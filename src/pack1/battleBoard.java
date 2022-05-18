package pack1;

import java.util.Arrays;
import java.util.Vector;

public class battleBoard {
    private int boardLength;

    private int boardWidth;

    private String[][] battleBoard;

    //pack1.battleBoard constructor
    public battleBoard(int boardLength,int boardWidth){
        this.boardLength=boardLength;
        this.boardWidth=boardWidth;
        this.battleBoard=new String[boardLength][boardWidth];
    }

    public int getBoardLength() {
        return boardLength;
    }

    public void setBoardLength(int boardLength) {
        this.boardLength = boardLength;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    public void buildBattleBoard(){
        //fillup board
        /*
        for(int i=0;i<boardLength;i++){
            for(int j=0;j<boardWidth;j++){
                pack1.battleBoard[i][j]="*";
            }
        }
        */
         for(int i=0;i<boardLength;i++){
             Arrays.fill(battleBoard[i],"*");
             }



        //randomlly put monsters on the board
    }
    public void buildBattleBoard(Vector<Monster> monsters){
        //fillup board

        //Arrays.fill(pack1.battleBoard,'*');
        //randomlly put monsters on the board
    }

    public void drawBoard(){
        int k=1;
        while(k<=this.boardLength*3){
            System.out.print('_');
            k++;
        }
        System.out.println();
        for(int i=0;i<this.boardLength;i++){
            for(int j=0;j<this.boardWidth;j++){
                System.out.print('|'+this.battleBoard[i][j]+'|');
            }
            System.out.println();
        }
        int r=1;
        while(r<=this.boardLength*3){
            System.out.print('_');
            r++;
        }
    }

}
