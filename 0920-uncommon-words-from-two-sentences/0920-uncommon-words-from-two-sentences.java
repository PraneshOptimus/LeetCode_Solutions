class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String num : s1.split(" "))
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(String num : s2.split(" "))
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        int i=0;
        for(String key :  map.keySet())
        {
            if(map.get(key)==1)
            {
                count++;
            }
        }
        String[] ans = new String[count];
        for(String key :  map.keySet())
        {
            if(map.get(key)==1)
            {
                ans[i]=key;
                i++;
            }
        }
        return ans;
    }
}