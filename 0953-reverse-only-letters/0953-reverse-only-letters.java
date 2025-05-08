class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char[] ch = s.toCharArray();
        while(i<j)
        {
            if(!Character.isLetter(ch[i]))
            {
                i++;
            }
            if(!Character.isLetter(ch[j]))
            {
                j--;
            }
            if(Character.isLetter(ch[i])){
                if(Character.isLetter(ch[j])){
                    char temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                    i++;
                    j--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int k=0;k<ch.length;k++)
        {
            sb.append(ch[k]);
        }
        return sb.toString();
    }
}