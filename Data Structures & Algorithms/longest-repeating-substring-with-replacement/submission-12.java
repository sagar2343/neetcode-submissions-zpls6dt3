class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int maxWin = 0;
        int[] count = new int[26];

        for (int right=0; right<s.length(); right++) {
            count[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);
            int wind = right-left + 1;

            if (wind - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            wind = right - left + 1;
            maxWin = Math.max(maxWin, wind);
        }

        return maxWin;
    }
}