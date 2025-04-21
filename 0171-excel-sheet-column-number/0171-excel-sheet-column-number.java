class Solution {
    public int titleToNumber(String c) {
        int result =0;
        for(int i=0;i<c.length();i++)
        {
            result*=26;
            result+=(c.charAt(i)-'A')+1;
        }
        return result;
    }
}