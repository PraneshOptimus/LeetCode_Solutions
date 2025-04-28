class Solution {
    public int alternateDigitSum(int n) {
        int count=0;
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                count+=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            else{
                count-=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        return count;
    }
}