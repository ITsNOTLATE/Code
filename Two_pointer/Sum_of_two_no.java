package Two_pointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sum_of_two_no {
    void ans(int[] arr,int k){
        int start=0;
        int end=arr.length;
        List<Integer> ls=new ArrayList<>();
        while(start<= end){
            if(arr[start]+arr[end]==k){
                ls.add(start);
                ls.add(end);
            }
            if(arr[start]+arr[end]>k){
                end--;
            }else{
                start++;
            }
        }
    }
    boolean ans_hash(int[] arr,int k){
        HashMap<Integer,Integer> hs=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hs.containsKey(k-arr[i])){
                return true;
            }else{
                hs.put(arr[i],1);
            }
        }
        return false;
    }


}
