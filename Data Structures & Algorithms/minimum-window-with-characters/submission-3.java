class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] mapt = new int[128];
        int[] maps = new int[128];

        int left = 0;
        int minWin = s.length() + 1;
        int start = 0;

        for (int i=0; i<t.length(); i++) {
            mapt[t.charAt(i) - 'A']++;
        }

        for (int i=0; i<s.length(); i++) {
            maps[s.charAt(i) - 'A']++;
            
            while (checkContains(mapt, maps)) {
                if (i-left+1 < minWin) {
                    minWin = Math.min(minWin, i-left+1);
                    start = left;
                }

                maps[s.charAt(left) - 'A']--;
                left++;
            }
        }
        if (minWin == s.length()+1) return "";

        return s.substring(start, start+minWin);
    }

    private boolean checkContains(int[] mapt, int[] maps) {
        for (int i=0; i<mapt.length; i++) {
            if (mapt[i] > maps[i]) return false;
        }
        return true;
    }
}
