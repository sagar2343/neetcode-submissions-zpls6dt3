class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        int left = 0;
        int start = 0;
        int minWin = s.length() + 1;
        int[] countt = new int[128];
        int[] counts = new int[128];

        for (int i=0; i<t.length(); i++) {
            countt[t.charAt(i)]++;
        }

        for (int i=0; i<s.length(); i++) {
            counts[s.charAt(i)]++;

            while (check(countt, counts)) {
                int win = i - left + 1;
                if (win < minWin) {
                    minWin = win;
                    start = left;
                }
                counts[s.charAt(left)]--;
                left++;
            }            
        }
        if (s.length() + 1 == minWin) return "";

        return s.substring(start, start+minWin);
    }
    private boolean check(int[] t, int[] s) {
        for (int i=0; i<t.length; i++) {
            if (t[i] > s[i]) return false;
        }
        return true;
    }
}