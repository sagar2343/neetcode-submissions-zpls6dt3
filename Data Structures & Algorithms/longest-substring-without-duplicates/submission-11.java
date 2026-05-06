class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            count = Math.max(count, set.size());
        }
        return count;
    }
}
