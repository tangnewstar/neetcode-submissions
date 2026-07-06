class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num: nums) {
            boolean success = set.add(num);
            if (!success) {
                return true;
            }
            
        }
        return false;
    }
}