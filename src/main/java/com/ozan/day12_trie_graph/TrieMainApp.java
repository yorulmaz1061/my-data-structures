package com.ozan.day12_trie_graph;

import java.util.Arrays;
import java.util.List;

public class TrieMainApp {
    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("apple") ;
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        trie.insert("app") ;
        System.out.println(trie.search("app") + "  =>After insertion");
        List<String> dict= Arrays.asList("apple","pen");


        System.out.println(wordBreak2("applepenapple", dict));
    }

    public static boolean wordBreak2(String s, List<String> wordDict) {
        Trie trie=new Trie();
        for (String str:wordDict){
            trie.insert(str);
        }
        TrieNode currentNode =trie.root;
        char[] arr = s.toCharArray();
        int prevWordIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (!currentNode.children.containsKey(arr[i])) return false;
            currentNode = currentNode.children.get(arr[i]);
            if (currentNode.isWord) prevWordIndex=i;
            if(i== arr.length-1 && !currentNode.isWord && prevWordIndex>-1) {
                i=prevWordIndex;
                currentNode=trie.root;
            }
            if (currentNode.isWord && currentNode.children.isEmpty() ) {
                if(i== arr.length-1 && !currentNode.isWord && prevWordIndex>-1) {
                    i=prevWordIndex+1;
                    currentNode=trie.root;
                }
                if(i== arr.length-1 && currentNode.isWord) return true;
                else currentNode=trie.root;}

        }

        return currentNode.isWord;
    }
    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */



}
