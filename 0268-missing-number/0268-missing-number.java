class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int n = nums.length;
        int allSum = (n*(n+1))/2;
        int num = allSum-sum;
        return num;
    }
}