package Trie_ques;

import LinkedList_Questions.Node;

import java.util.HashMap;

public class Trie {
    boolean isTrue;
    HashMap<Character,Trie> hm;

    Trie(){
        this.isTrue=false;
        this.hm=new HashMap<>();
    }
}
