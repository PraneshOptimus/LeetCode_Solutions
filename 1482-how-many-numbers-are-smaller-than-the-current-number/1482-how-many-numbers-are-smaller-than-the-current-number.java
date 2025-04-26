class Solution {
    public static int co(int[] arr,int n)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(n>arr[i])
            {
                count++;
            }
        }
        return count;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=co(nums,nums[i]);
        }
        return arr;
    }
}