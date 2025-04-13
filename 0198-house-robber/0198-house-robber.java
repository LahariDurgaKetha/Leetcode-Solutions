class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int notrob = 0;
        for(int i=0;i<nums.length;i++){
            int newRob = notrob+nums[i];
            int newNotRob = Math.max(rob,notrob);
            rob = newRob;
            notrob = newNotRob; 
        }
        return Math.max(rob,notrob);
    }
}