class Solution {
    public char findTheDifference(String s, String t) {
        int ssum =0;
        int tsum =0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            ssum+=(int) ch;
        }
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            tsum+=(int) ch;
        }
        char ch = (char) (tsum-ssum);
        return ch;
    }
}