class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length==1) return arr[0];
        Map<Integer,Integer> map = new HashMap<>();
        for(int nums : arr)
        {
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        int num=0;
        int ke = 0;
        for(int key : map.keySet())
        {
            if(map.get(key)>1)
            {
                if(map.get(key)>ke)
                {
                    ke = map.get(key);
                    num=key;
                }
            }
        }
        return num;
    }
}