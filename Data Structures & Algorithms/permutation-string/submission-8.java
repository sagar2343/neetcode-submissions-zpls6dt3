class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];
        int left = 0;

        for (char c : s1.toCharArray()) {
            counts1[c - 'a']++;
        }

        for (int i=0; i<s2.length(); i++) {
            counts2[s2.charAt(i) - 'a']++;

            while (i - left + 1 > s1.length()) {
                counts2[s2.charAt(left) - 'a']--;
                left++;
            }

            if (i - left + 1 == s1.length()) {
                if (Arrays.equals(counts1, counts2)) return true;
            }
        }

        return false;
    }
}
