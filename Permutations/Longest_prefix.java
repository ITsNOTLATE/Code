package Permutations;

import java.util.Arrays;

public class Longest_prefix {
    public static void main(String[] args) {
        String[] str={"club","client","click","clients"};

        Arrays.sort(str);
        String ans="";
        for(int i=0;i<10;i++){
            char c=str[0].charAt(i);
            char c2=str[3].charAt(i);
            if(c!=c2){
                break;
            }
            ans=ans+str[0].charAt(i);;
        }
        System.out.println(ans);
    }
}
