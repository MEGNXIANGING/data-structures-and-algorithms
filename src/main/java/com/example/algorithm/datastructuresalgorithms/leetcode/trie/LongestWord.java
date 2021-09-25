package com.example.algorithm.datastructuresalgorithms.leetcode.trie;

import java.util.HashMap;

public class LongestWord {
    public String longestWord(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        Trie root = new Trie();
        for (String word : words) {
            Trie cur = root;
            for (char c : word.toCharArray()) {
                if (cur.children.containsKey(c)) {
                    cur = cur.children.get(c);
                } else {
                    Trie newNode = new Trie();
                    cur.children.put(c, newNode);
                    cur = newNode;
                }
            }
            cur.isEnd = true;
            cur.val = word;
        }
        String res = "";
        for (String word : words) {
            Trie cur = root;
            if (word.length() > res.length() || word.length() == res.length() && word.compareTo(res) < 0) {
                boolean isWord = true;
                for (char c : word.toCharArray()) {
                    cur = cur.children.get(c);
                    if (!cur.isEnd) {
                        isWord = false;
                        break;
                    }
                }
                res = isWord ? word : res;
            }
        }
        return res;
    }
}

class Trie {
    public HashMap<Character, Trie> children = new HashMap<>();
    public boolean isEnd = false;
    public String val = null;
}
