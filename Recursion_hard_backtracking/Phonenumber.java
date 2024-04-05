package Recursion_hard_backtracking;

public class Phonenumber {
    void phone(String s1,String s2,int i,int j,String curr){
        if(s1.length()==i){
            System.out.println(curr);
            return ;
        }
        char ch1=s1.charAt(i);
        char ch2=s2.charAt(j);
       /* phone(s1,s2,i,j++,);
        phone(s1,s2,i++,j,);*/
    }
}
