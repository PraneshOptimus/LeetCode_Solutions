class Solution {
    public int minStartValue(int[] nums) {
        int m =0,s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            m = Math.min(s,m);
        }
        return 1-m;
    }
}