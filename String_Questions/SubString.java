package String_Questions;

import Interface.Student;

import java.util.HashMap;

public class SubString  {

    int longest_sub(String s){
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
            ans=find(s,i, i);
        }

        for (int i = 0; i < s.length(); i++) {
            ans=find(s,i, i+1);
        }
        return ans;
    }
    int find(String s,int i,int j){
        while (i>0&&j<s.length()&& s.charAt(i)==s.charAt(j)){
    i++;j++;
        }
        return j-i;
    }
    int macth_string(String s1,String s2){
        int ans=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        HashMap<Character,Integer> hs2=new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if(hs.containsKey(s1.charAt(i))){
                hs.put(s1.charAt(i),hs.get(s1.charAt(i))+1);
            }else{
                hs.put(s1.charAt(i),1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if(hs2.containsKey(s2.charAt(i))){
                hs2.put(s2.charAt(i),hs2.get(s2.charAt(i))+1);
            }else{
                hs2.put(s2.charAt(i),1);
            }
            if (hs.get(s2.charAt(i))>=hs2.get(s2.charAt(i))) {
                ans++;
            }
            int start=0;
            int end=4;
            while (end<s1.length()){
                if(hs.containsKey(s1.charAt(start))){
                    hs.put(s1.charAt(start),hs.get(s1.charAt(start))-1);
                }
                if(hs2.containsKey(s1.charAt(start)) && hs2.get(s1.charAt(start))<=hs.get(s1.charAt(start))){
                    ans--;
                }
                if(hs.containsKey(s1.charAt(end))){
                    hs.put(s1.charAt(end),hs.get(s1.charAt(start))+1);
                }
                if(hs2.containsKey(s1.charAt(end)) && hs2.get(s1.charAt(end))<=hs.get(s1.charAt(end))){
                    ans++;
                }
            }
        }
    return ans;

    }
}
