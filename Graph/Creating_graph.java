package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Creating_graph {
    public static void main(String[] args) {

        ArrayList<ArrayList<Edge>> as = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            ArrayList<Edge> al = new ArrayList<>();
            as.add(al);
        }

        for(int i=0;i<=10;i++) {
            Edge edge = new Edge(i, i + 1);
            as.get(i).add(edge);

        }      }}
/*

        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        while(queue>0){
            int ele=queue.peek();
            queue.remove();

            for (int i = 0; i < ele; i++) {
                int inside=as.get(0);
                if(inside ==1){
                    visited==1;
                }

            }
        }
//dfs
        for(int i=0;i<as.get(0).get();i++){
        dfs()
    }
}*/
