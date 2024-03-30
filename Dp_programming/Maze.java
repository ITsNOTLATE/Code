package Dp_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Maze {
    public static ArrayList<ArrayList<Integer>> list=new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> dp= new ArrayList<>();
    static int max(int i,int j){
       if(i<0||j<0){
           return 0;
       }
       if(list.get(i).get(j)==0){
           return 0;
       }
       if(i==0&&j==0){
           return 1;
       }
        return max(i,j-1)+max(i-1,j);
    }

    static int dp_max_maze(int i,int j){
        if(i<0||j<0){
            return 0;
        }
        if(list.get(i).get(j)==0){
            return 0;
        }
        if(i==0&&j==0){
            return list.get(i).get(j);
        }
        return Math.max(list.get(i).get(j)+max(i,j-1),list.get(i).get(j)+max(i-1,j));
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> as=new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                int x=scanner.nextInt();
                as.add(x);
            }
            list.add(as);
        }
        System.out.println("<-------------------your maze----------------------->");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(0).size(); j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
            
            }
        }

        System.out.println(Maze.dp_max_maze(2,2));


    System.out.println(Maze.max(2,2));

    }

}
