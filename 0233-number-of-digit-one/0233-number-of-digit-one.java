class Solution {
    public int countDigitOne(int n) {
        if(n>=1 && n<=9) return 1;
        if(n==0) return 0;
        int count=0;
        for(long i=1;i<=n;i*=10)
        {
            long div = i*10;
            count+= (n/div)*i+Math.min(Math.max(n%div-i+1,0),i);
        }
        return count;
    }
}