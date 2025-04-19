class Solution {
    public boolean squareIsWhite(String c) {
        int n = ((char) c.charAt(0));
        int n1 = Integer.parseInt(String.valueOf(c.charAt(1)));
        int ans = n+n1;
        if(ans%2==0) return false;
        return true;
    }
}