//Given a string s, find the length of the longest substring without repeating characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int left = 0;
        int maxLength = 0;
        
        for(int right=0; right<n; right++)
        {
            char c = s.charAt(right);
            if(map.containsKey(c))
            {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            maxLength = Math.max(maxLength, right - left +1);

        }
        return maxLength;
    }
}
