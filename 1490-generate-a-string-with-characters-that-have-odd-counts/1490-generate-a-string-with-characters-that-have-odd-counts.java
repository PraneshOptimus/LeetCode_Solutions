class Solution {
    public String generateTheString(int n) {
        StringBuilder a=new StringBuilder();
        if(n%2==0)
        {
            for(int i=1;i<n;i++)
            {
                a.append("a");
            }
            a.append("b");
        }
        else{
            for(int i=1;i<=n;i++)
            {
                a.append("a");
            }
        }
        return a.toString();
    }
}