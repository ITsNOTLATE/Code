package Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Greedy {
    public static void main(String[] args) {
        Pair[] p = new Pair[10];
        int j=10;
        int k=0;
        for (int i = 0; i < 10; i++) {
        Pair pair=new Pair(j,k);
        j--;
        k++;
        p[i]=pair;
        }
        Arrays.sort(p, new ArrComp<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.getFood()>o2.getFood()){
                    return 0;
                }
                return 1;
            }
        });


    }
}
