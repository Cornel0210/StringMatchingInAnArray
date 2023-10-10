package check;

import java.util.*;

/**
 * Given an array of string words, return all strings in words that is a substring of another word.
 * You can return the answer in any order.
 *
 * A substring is a contiguous sequence of characters within a string
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["mass","as","hero","superhero"]
 * Output: ["as","hero"]
 * Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
 * ["hero","as"] is also a valid answer.
 * Example 2:
 *
 * Input: words = ["leetcode","et","code"]
 * Output: ["et","code"]
 * Explanation: "et", "code" are substring of "leetcode".
 */

public class Solution {

    public List<String> stringMatching(String[] words) {
        Set<String> matchingStrings = new HashSet<>();

        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].contains(words[j])){
                    matchingStrings.add(words[j]);
                } else if (words[j].contains(words[i])){
                    matchingStrings.add(words[i]);
                }
            }
        }
        return new ArrayList<>(matchingStrings);
    }
}
