class Solution {
    public static int ans(int n)
    {
        if((n<10) && (n%2==0)) return n;
        int ans=0;
        while(n!=0)
        {
            int digit = n%10;
            ans+=digit;
            n/=10;
        }
        if(ans%2==0) return ans;
        return 0;
    }
    public int countEven(int num) {
       int count=0;
       for(int i=1;i<=num;i++)
       {
        if(ans(i)!=0)
        {
            count++;
        }
       }
       return count;
    }
}