package pack1;

import pack1.battleBoard;

public class Main {
    public static void main(String[] args){

    battleBoard bb=new battleBoard(3,3);
    bb.buildBattleBoard();
    bb.drawBoard();
    }
}