package Permutations;

public class ndivide2 {
    public static void main(String[] args) {
        int[] arr={6,2,2,6,66,6,6,6,6,6,6,6,6,6,6,6,6,6,6,1,6,3,6,5,5,5,5,5,5,5,5,5};
        int no=arr[0];
        int count=1;
        for (int i = 1; i < arr.length; i++) {
            if(no==arr[i]){
                count++;
            }else {
                if(count==1){
                    no=arr[i];
                }else {
                    count--;
                }
            }
        }
        System.out.println(no);
    }
}
