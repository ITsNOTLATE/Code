package LinkedList_Questions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class String_class{
    public int solve(@NotNull ArrayList<Integer> A, int B) {
        int count=0;
        int l=0;
        int r=A.size()-1;
        while(l<A.size()&&r>=0){
            int first=A.get(l);
            int sec=A.get(r-1);
            int mul=first*sec;
            if(mul<B){
                count+=r;
                l++;
            }else{
                r--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> as=new ArrayList<>();
        as.add(1);
        as.add(2);
        as.add(3);
        as.add(4);
        as.add(5);


        String_class stringClass=new String_class();
        int no=stringClass.solve(as,5);
        System.out.println(no);
    }
}
