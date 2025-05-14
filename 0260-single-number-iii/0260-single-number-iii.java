class Solution {
    public int[] singleNumber(int[] nums) {
        int n1 =0;
        int n2 =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet())
        {
            if(map.get(key)==1)
            {
                if(n1==0)
                {
                    n1=key;
                }
                else{
                    n2=key;
                }
            }
        }
        return new int[]{n1,n2};
    }
}