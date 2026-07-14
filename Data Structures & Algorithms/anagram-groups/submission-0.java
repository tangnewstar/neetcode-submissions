class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // hashmap store word freq 
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for(String word: strs) {
            // calc letter freq
            int[] freq = new int[26];
            for(char c: word.toCharArray()) {
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);
            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(word);
        }

        return new ArrayList(map.values());
    }

}
