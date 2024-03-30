package Permutations;

public class SwapString {
    public static void main(String[] args) {
        String s="ABCD";

        char[] ch=s.toCharArray();
        char temp=ch[0];
        ch[0]=ch[3];
        ch[3]=temp;
        s=String.valueOf(ch);
        for (int i = 0; i <=3; i++) {
            System.out.print(s.charAt(i));
        }
    }
}
