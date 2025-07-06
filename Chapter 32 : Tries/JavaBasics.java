//Tries ✅ 
import java.util.*;

public class JavaBasics {
    static class Node {
        Node[] children = new Node[26];
        boolean isEndOfWord = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert a word into the trie
    public static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (current.children[ch - 'a'] == null) {
                current.children[ch - 'a'] = new Node();
            }
            current = current.children[ch - 'a'];
        }
        current.isEndOfWord = true;
    }

    // Search for a word in the trie
    public static boolean search(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (current.children[ch - 'a'] == null) {
                return false;
            }
            current = current.children[ch - 'a'];
        }
        return current.isEndOfWord;
    }

    // Delete a word from the trie
    public static void delete(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (current.children[ch - 'a'] == null) {
                return;
            }
            current = current.children[ch - 'a'];
        }
        current.isEndOfWord = false;
    }

    // Word break problem
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    // Prefix problem
    public static List<String> prefix(String s) {
        List<String> result = new ArrayList<>();
        Node current = root;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (current.children[ch - 'a'] == null) {
                break;
            }
            current = current.children[ch - 'a'];
            if (current.isEndOfWord) {
                result.add(s.substring(0, i + 1));
            }
        }
        return result;
    }

    // Longest word with all prefixes
    public static String longestWord(String[] words) {
        String longest = "";
        for (String word : words) {
            if (prefix(word).size() == words.length) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "thee"};

        // Insert words into the trie
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        // Search for words in the trie
        System.out.println(search("thee"));  // true
        System.out.println(search("thor"));  // false

        // Delete a word from the trie
        delete("their");
        System.out.println(search("their"));  // false

        // Word break problem
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        System.out.println(wordBreak(s, wordDict));  // true

        // Prefix problem
        System.out.println(prefix("the"));  // ["the", "thee"]

        // Longest word with all prefixes
        System.out.println(longestWord(words));  // "thee"
    }
}
