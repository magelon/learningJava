import java.util.Arrays;

public class battleBoard {
    public battleBoard(){}

    private void buildBattleBoard(){
        //creat a battleBoard
        String[][] battleBoard=new String[10][10];
        //fillup board
        //creat monster array
        Monster[] monsters=new Monster[5];
        //randomlly put monsters on the board
        //draw the board
        int k=1;
        while(k<=30){
            System.out.print('_');
            k++;
        }


    }
    private static void fillUpArray(String[][] battleBoard){
        for (String[] strings : battleBoard) {
            Arrays.fill(strings, "*");
        }
    }
}
