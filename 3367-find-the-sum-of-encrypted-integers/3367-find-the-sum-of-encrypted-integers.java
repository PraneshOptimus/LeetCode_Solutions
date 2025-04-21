class Solution {
    public static int ans(int n)
    {
        if(n<=9) return n;
        int count=0;
        int max =0;
        while(n!=0)
        {
            int digit = n%10;
            count++;
            if(max<digit) max = digit;
            n/=10;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<count;i++)
        {
            sb.append(String.valueOf(max));
        }
        int an = Integer.parseInt(String.valueOf(sb.toString()));
        return an;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count+=ans(nums[i]);
        }
        return count;
    }
}