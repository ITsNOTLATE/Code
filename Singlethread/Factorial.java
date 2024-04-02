package Singlethread;

import java.util.Arrays;

public class Factorial {

    static int[] dp = new int[5 + 1];

    void print() {
        for (int i = 0; i < 5; i++) {
            System.out.println(dp[i]);

        }
    }

    int fab(int n) {
        if (n <= 1) {
            dp[n] = 1;
            return dp[n];
        }

        if (dp[n] == -1) {
            dp[n] = fab(n - 1) + fab(n - 2);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        for (int i = 0; i <= 5; i++) {
            dp[i] = -1;
        }
        System.out.println(factorial.fab(5));

    }
}
