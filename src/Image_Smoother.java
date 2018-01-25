public class Image_Smoother {
    public int[][] imageSmoother(int[][] M) {
        int row = M.length;
        int col = M[0].length;
        int[][] ans = new int[row][col];
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                sum =M[i][j];
                count=1;
                if(i-1>=0){
                    sum+=M[i-1][j];
                    count++;
                    if(j-1>=0){
                        sum+=M[i-1][j-1];
                        count++;
                    }
                    if(j+1<col){
                        sum+=M[i-1][j+1];
                        count++;
                    }
                }

                if(j+1<col){
                    sum+=M[i][j+1];
                    count++;
                }

                if(j-1>=0){
                    sum+=M[i][j-1];
                    count++;
                    if(i+1<row){
                        sum+=M[i+1][j-1];
                        count++;
                    }
                }

                if(i+1<row){
                    sum+=M[i+1][j];
                    count++;

                    if(j+1<col){
                        sum+=M[i+1][j+1];
                        count++;
                    }
                }
                ans[i][j] = (int)Math.floor(sum/count);
            }
        }
        return ans;
    }

//    public int[][] imageSmoother(int[][] M) {
//        if (M == null) return null;
//        int rows = M.length;
//        if (rows == 0) return new int[0][];
//        int cols = M[0].length;
//
//        int result[][] = new int[rows][cols];
//
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                int count = 0;
//                int sum = 0;
//                for (int incR : new int[]{-1, 0, 1}) {
//                    for (int incC : new int[]{-1, 0, 1}) {
//                        if (isValid(row + incR, col + incC, rows, cols)) {
//                            count++;
//                            sum += M[row + incR][col + incC];
//                        }
//                    }
//                }
//                result[row][col] = sum / count;
//            }
//        }
//
//        return result;
//
//    }
//
//    private boolean isValid(int x, int y, int rows, int cols) {
//        return x >= 0 && x < rows && y >= 0 && y < cols;
//    }
}
