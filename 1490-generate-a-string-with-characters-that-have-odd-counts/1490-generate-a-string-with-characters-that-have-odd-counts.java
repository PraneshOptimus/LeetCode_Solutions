class Solution {
    public String generateTheString(int n) {
        String a="";
        if(n%2==0)
        {
            for(int i=1;i<n;i++)
            {
                a+="a";
            }
            a+="b";
        }
        else{
            for(int i=1;i<=n;i++)
            {
                a+="a";
            }
        }
        return a;
    }
}