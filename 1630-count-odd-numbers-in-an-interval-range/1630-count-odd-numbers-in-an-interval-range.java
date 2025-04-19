class Solution {
    public int countOdds(int low, int high) {
        int odd=0;
        int n=(high-low)+1;
        if(n%2==0) odd=n/2;
        if(n%2!=0)
        {
            if(low%2!=0 || high%2!=0)
            {
                odd=(n/2)+1;
            }
            else{
                odd=n/2;
            }
        }
        return odd;
    }
}