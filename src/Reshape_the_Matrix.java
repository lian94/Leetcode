public class Reshape_the_Matrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if(r * c != row * col)
            return nums;
        int [][] ans= new int [r][c];
        int m = 0;
        int n = 0;
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                ans[m][n] = nums[i][j];
                n ++;
                if(n == c){
                    n = 0;
                    m ++;
                }
            }
        }
        return ans;
    }
}
