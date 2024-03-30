package Permutations;

import java.util.HashMap;

public class HashSave_twoString {
    public static void main(String[] args) {
        String s1="helloiloveu";
        String s2="helloihateu";
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch=s1.charAt(i);
            if(hm1.containsKey(ch)){
                hm1.put(ch,hm1.get(s1.charAt(i))+1);
            }else{
                hm1.put(ch,1);
            }
        }
        int count=0;
        for (int i = 0; i < s2.length(); i++) {
            char ch=s2.charAt(i);
            if(hm2.containsKey(ch)){
                hm2.put(ch,hm1.get(s1.charAt(i))+1);
            }else{
                hm2.put(ch,1);
            }
            if(hm1.containsKey(ch)&&hm1.get(ch)>hm2.get(ch)){
                count++;
            }
        }
        int start=0;
        int end=4;
        while (end<s2.length()){
            char ch=s2.charAt(start);
            hm2.put(ch,hm2.get(ch)-1);
            if(hm2.containsKey(ch)&&hm2.get(ch)<hm1.get(ch)){
                count--;
            }
            char ch1=s2.charAt(end);
            hm2.put(ch,hm2.get(ch)+1);
            if(hm2.containsKey(ch)&&hm2.get(ch)<=hm1.get(ch)){
                count++;
            }
            if(count==4){
                System.out.println(5);
            }
            start++;
            end++;

        }
    }
}
