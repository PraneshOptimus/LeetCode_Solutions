class Solution {
    static boolean isYes(String str)
    {
        str=str.toLowerCase();
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(str1.contains(String.valueOf(ch)))
            {
                flag1 = false;
            }
            else if(str2.contains(String.valueOf(ch)))
            {
                flag2 = false;
            }
            else if(str3.contains(String.valueOf(ch)))
            {
                flag3 = false;
            }
        }
        if(flag1 && !flag2 && flag3) return true;
        else if(!flag1 && flag2 && flag3) return true;
        else if(flag1 &&flag2 && !flag3) return true;
        return false;
    }
    public String[] findWords(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(isYes(words[i])) count++;
        }
        String[] ans = new String[count];
        int k=0;
        for(int i=0;i<words.length;i++)
        {
            if(isYes(words[i])) ans[k++]=words[i];
        }
        System.out.print(count);
        return ans;
    }
}