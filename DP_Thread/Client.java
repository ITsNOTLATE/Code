package DP_Thread;

public class Client {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Subset subset = new Subset(arr, 0);
        System.out.println(subset);
    }
}
