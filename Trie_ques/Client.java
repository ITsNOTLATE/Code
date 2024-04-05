package Trie_ques;
public class Client {
    static  class Pair{
        int protien;
        int wiegth;
        int intake;
    }
    void insert(Trie root,String word){
        Trie t=root;
        int l=word.length();
        for (int i = 0; i < l; i++) {
            char ch=word.charAt(i);
            if(t.hm.containsKey(ch)){
               t=t.hm.get(ch);
            }else{
                Trie nn=new Trie();
                t.hm.put(ch,nn);
                t =nn;
            }
        }
        t.isTrue=true;
    }

    boolean search(Trie root,String word) {
        Trie t = root;
        int l = word.length();
        for (int i = 0; i < l; i++) {
            char ch = word.charAt(i);
            if (t.hm.containsKey(ch)) {
                t = t.hm.get(ch);
            } else {
                return false;
            }
        }
    return true;
    }


    public static void main(String[] args) {
        Trie root=new Trie();
        Client client=new Client();
        client.insert(root,"hello");
        System.out.println(client.search(root,"hello"));

    }
}
