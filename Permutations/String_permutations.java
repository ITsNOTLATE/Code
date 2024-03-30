package Permutations;
public class String_permutations {
    void permute(String s,int l ,int h){
        if(l==h){
            System.out.println(s);
        }else{
        for (int i = l; i <= h; i++) {
            swap(s,i,l);
            permute(s,l+1,h);
            swap(s,i,l);
        }
        }
    }

    private String swap(String s,int c, int  c1) {
       char[] ch=s.toCharArray();
       char temp=ch[c];
       ch[c]=ch[c1];
       ch[c1]=temp;
       String.valueOf(ch);
       return s;
    }

    public static void main(String[] args) {
        String s="ABC";
        String_permutations stringPermutations=new String_permutations();
        stringPermutations.permute(s,0,2);

    }
}
