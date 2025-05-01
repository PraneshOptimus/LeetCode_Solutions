class Solution {
    public boolean checkXMatrix(int[][] grid) {
        // List<Integer> arr = new ArrayList<>();
        int k=0;
        int m= grid.length-1;
        for(int i=0;i<grid.length;i++)
        {
            if(grid[i][k]==0) return false;
            if(grid[i][m]==0) return false;
            k++;
            m--;
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i!=j && i!=grid.length-j-1)
                {
                    if(grid[i][j]!=0) return false;
                }
            }
        }
        return true;
    }
}