class Solution {
    public int countSubarrays(int[] nums) {
        if(nums.length==3)
            if(nums[0]==0 && nums[1]==0 && nums[2]==0) return 1;
            else if(nums[0]==nums[1] && nums[1]==nums[2])
                 return 0;
        int count=0;
        for(int i=0;i<=nums.length-3;i++)
        {
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];
            if(b/2.0==(a+c)) count++;
        } 
        return count;
    }
}