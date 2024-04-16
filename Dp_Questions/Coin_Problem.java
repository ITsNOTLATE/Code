package Dp_Questions;
@MyAnn(name="hello",t=10)
public class Coin_Problem {
    int[] dp = new int[10];

    int lets_count(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] == 0) {
            dp[n]=lets_count(n - 1) + lets_count(n - 2) + lets_count(3);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Coin_Problem coinProblem=new Coin_Problem();
        MyAnnImpl impl=new MyAnnImpl();
        impl.name();
    }
}
