class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 =  new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='i')
            {
                sb.reverse();
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}