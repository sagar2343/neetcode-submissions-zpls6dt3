class Solution {
    public int characterReplacement(String s, int k) {
        int maxWindow = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);
            int windLength = right - left + 1;
            if (windLength - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            windLength = right - left + 1;
            maxWindow = Math.max(maxWindow, windLength);
        }
        return maxWindow;
        
    }
}
