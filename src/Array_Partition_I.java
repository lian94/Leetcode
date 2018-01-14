import java.util.Arrays;

public class Array_Partition_I {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    //把nums的数值作为下标存放在exist数组中
    //nums中出现的数字i在exist数组中就是exist[i] = 1
    //此时nums中所有数值作为下标i已经排序完毕
    //遍历exist数组，因此只需每隔一个i加和即可
//    public int arrayPairSum(int[] nums) {
//        int[] exist = new int[20001];
//        for (int i = 0; i < nums.length; i++) {
//            exist[nums[i] + 10000]++;
//        }
//        int sum = 0;
//        boolean odd = true;
//        for (int i = 0; i < exist.length; i++) {
//            while (exist[i] > 0) {
//                if (odd) {
//                    sum += i - 10000;
//                }
//                odd = !odd;
//                exist[i]--;
//            }
//        }
//        return sum;
//    }
}
