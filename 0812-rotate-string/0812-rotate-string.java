class Solution {
    public boolean rotateString(String s, String goal) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++)
            list.add(s.charAt(i));
        for(int i=0;i<list.size();i++)
        {
            List<Character> newList = new ArrayList<>(list);
            Collections.rotate(newList,i);
            String str = "";
            for(int j=0;j<newList.size();j++)
            {
                str+=String.valueOf(newList.get(j));
            }
            if(str.equals(goal)) return true;
        }
        return false;
    }
}