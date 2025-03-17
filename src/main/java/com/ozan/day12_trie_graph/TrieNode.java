package com.ozan.day12_trie_graph;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    //Like in the linked list we put classname as a value(Trienode)
    public Map<Character, TrieNode> children = new HashMap<>();
    //This means that if I iterate over trie it will look if it is a word
    //Like a (false)-p (false)-p (false)-l (false)-e (apple)
    public boolean isWord = false;
}
