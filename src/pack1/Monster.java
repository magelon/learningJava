package pack1;

public class Monster{
    String name;
    int[][] position;
    int hitpoints;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int[][] getPosition(){
        return this.position;
    }
    public void setPosition(int[][] position){
        this.position=position;
    }

    public int getHitpoints(){
        return this.hitpoints;
    }
    public void setHitpoints(int hitpoints){
        this.hitpoints=hitpoints;
    }

    public Monster(String name,int[][] position,int hitpoints){
        this.name=name;
        this.position=position;
        this.hitpoints=hitpoints;
    }

}
