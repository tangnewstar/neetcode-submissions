class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            Integer count = sMap.getOrDefault(s.charAt(i), 0);
            sMap.put(s.charAt(i), count + 1);
        }
        for(int i = 0; i < t.length(); i++) {
            Integer count = tMap.getOrDefault(t.charAt(i), 0);
            tMap.put(t.charAt(i), count + 1);
        }

        if (!sMap.keySet().equals(tMap.keySet())) {
            return false;
        }

        for(Character key: sMap.keySet()) {
            Integer sCount = sMap.get(key);
            Integer tCount = tMap.get(key);
            if (sCount == null || tCount == null || !sCount.equals(tCount)) {
                return false;
            }
        }

        return true;
    }
}
