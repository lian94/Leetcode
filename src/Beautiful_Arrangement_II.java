public class Beautiful_Arrangement_II {
    public int[] constructArray(int n, int k) {
        int[] ans = new int [n];
        int index = n - k;
        int num = n;
        //先循环一遍数组，最大的数放在index为n-k的地方
        //其次每隔2位放一个次大的
        while(index < n){
            ans[index] = num;
            num --;
            index += 2;
        }
        int j = 1;
        for (int i = 0; i < n; i++) {
            if(ans[i] == 0){
                ans[i] = j;
                j ++;
            }
        }
        return ans;
    }
}

//    使用两个数，一个赋大值，一个赋小值
//    public int[] constructArray(int n, int k) {
//        int left = 1, right = n;
//        int[] res = new int[n];
//        for (int i = 0; i < n; i++) {
//            if (k == 1) {
//                res[i] = left++;
//            } else {
//                if (k-- % 2 != 0) {
//                    res[i] = left++;
//                } else {
//                    res[i] = right--;
//                }
//            }
//        }
//        return res;
//    }
