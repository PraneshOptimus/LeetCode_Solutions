class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i = 0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        while(i<w1.length() || j<w2.length())
        {
            if(i<w1.length()) sb.append(String.valueOf(w1.charAt(i++)));
            if(j<w2.length()) sb.append(String.valueOf(w2.charAt(j++)));
        }
        // if(i>=w1.length()) sb.append(String.valueOf(w2.substring(j)));
        // else if(j>=w2.length()) sb.append(String.valueOf(w1.substring(i)));
        return sb.toString();
    }
}