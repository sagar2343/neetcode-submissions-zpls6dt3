class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int[] count = new int[26];
        int maxFreq = 0;
        int maxWin = 0;

        for (int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(i) - 'A']);
            int win = i - left + 1;
            if (win - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            win = i - left + 1;
            maxWin = Math.max(maxWin, win);
        }

        return maxWin;
    }
}