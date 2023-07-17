package Lec_19;

public class Maze_path {
    public static void main(String[] args) {
        maze(0,0,2,2,"");
    }
    public static void maze(int row,int col,int erow,int ecol,String ans){
        if(row==erow && col==ecol){
            System.out.println(ans);
            return;
        }

        if(row>erow || col>ecol){
            return;
        }


        //RIGHT
        maze(row,col+1,erow,ecol,ans+"R");
        //DOWN
        maze(row+1,col,erow,ecol,ans+"D");

    }
}
