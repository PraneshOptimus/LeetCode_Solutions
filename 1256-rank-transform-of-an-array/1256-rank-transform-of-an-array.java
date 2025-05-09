class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for(int num : arr)
        {
            set.add(num);
        }
        int rank=1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : set)
        {
            map.put(num,rank++);
        }
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}