class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int n = nums[i];
            int temp=0;
            while(n!=0)
            {
                int digit = n%10;
                temp=(temp*10)+digit;
                n/=10;
            }
            while(temp!=0)
            {
                int digit = temp%10;
                arr.add(digit);
                temp/=10;
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
    }
}