class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hash map store i,j 
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            Integer remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                Integer j = map.get(remaining);
                return i > j ? new int[]{j,i} : new int[]{i,j};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
