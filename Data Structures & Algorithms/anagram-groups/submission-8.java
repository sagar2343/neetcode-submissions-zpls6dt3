class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();

        HashMap<String, List> ansMap = new HashMap<>();
        int[] count = new int[26];

        for (String str : strs) {
            Arrays.fill(count, 0);

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int n : count) {
                sb.append('#');
                sb.append(n);
            }

            String key = sb.toString();
            if (!ansMap.containsKey(key)) {
                ansMap.put(key, new ArrayList());
            }
            ansMap.get(key).add(str);
        }
        return new ArrayList(ansMap.values());
    }
}
