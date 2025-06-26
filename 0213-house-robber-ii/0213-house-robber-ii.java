class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int dp1[] = new int[n];
        Arrays.fill(dp1,-1);
        int dp2[] = new int[n];
        Arrays.fill(dp2,-1);
        int case1 = f(0,n-2,nums,dp1);
        int case2 = f(1,n-1,nums,dp2);
        return Math.max(case1,case2);
    }
    int f(int s,int l,int nums[],int dp[]){
        if(s>l) return 0;
        if(dp[s]!=-1) return dp[s];
        int pick = nums[s]+f(s+2,l,nums,dp);
        int notpick = f(s+1,l,nums,dp);
        return dp[s] = Math.max(pick,notpick);
    }
}
