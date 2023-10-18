package com.java2;

import java.util.HashMap;

/**
 * Author: CodeChen
 * Date: 2023-09-29 23:20
 * Description:
 **/

class Solution{
    public int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int maxLength = 0;
        int j = 0;
        for(int i = 0;i < s.length();i++){
            if(hashMap.containsKey(s.charAt(i))){
                j = Math.max(j,hashMap.get(s.charAt(i)));
                }
            maxLength = Math.max(maxLength,i - j + 1);
            hashMap.put(s.charAt(i),i + 1);
            }

        return maxLength;


    }
}

public class LeetCodeTest {

}
