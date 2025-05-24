class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            int count=0;
            int k=0;
            for(int j=0;j<words[i].length();j++)
            {
                char ch = words[i].charAt(j);
                if(ch==x)
                {
                    arr.add(i);
                    break;
                }
                
            }
            
            
        }
        return arr;
    }
}