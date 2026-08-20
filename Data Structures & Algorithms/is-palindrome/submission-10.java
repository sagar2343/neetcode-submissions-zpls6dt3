class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return false;

        ArrayList<Character> ch = new ArrayList<>();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                ch.add(Character.toLowerCase(c));
            }
        }

        int left = 0;
        int right = ch.size()-1;
        while (left < right) {
            if (ch.get(left) != ch.get(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
