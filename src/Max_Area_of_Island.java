public class Max_Area_of_Island {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    max = Math.max(max, areaOfIsland(grid, i, j));
                }
            }
        }
        return max;
    }

    public int areaOfIsland(int[][] grid, int i, int j){
        if( i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
            grid[i][j] = 0;
            return 1 + areaOfIsland(grid, i+1, j)
                    + areaOfIsland(grid, i-1, j)
                    + areaOfIsland(grid, i, j-1)
                    + areaOfIsland(grid, i, j+1);
        }
        return 0;
    }
}
