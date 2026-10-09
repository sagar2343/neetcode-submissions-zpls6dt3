class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        HashMap<String, List> map = new HashMap<>();
        int[] count = new int[26];

        for (String str : strs) {
            Arrays.fill(count, 0);

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int n : count) {
                sb.append("#");
                sb.append(n);
            }
            String code = sb.toString();
            if (!map.containsKey(code)) {
                map.put(code, new ArrayList());
            }
            map.get(code).add(str);
        }
        return new ArrayList(map.values());
    }
}
