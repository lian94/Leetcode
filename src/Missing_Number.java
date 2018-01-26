public class Missing_Number {
    public int missingNumber(int[] nums) {
        int ans[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            ans[nums[i]] = 1;
        }
        for (int i = 0; i < ans.length; i++) {
            if(ans[i] == 1)
                continue;
            else
                return i;
        }
        return 0;
    }

    // a^b^b =a
//    public int missingNumber(int[] nums) {
//
//        int xor = 0, i = 0;
//        for (i = 0; i < nums.length; i++) {
//            xor = xor ^ i ^ nums[i];
//        }
//
//        return xor ^ i;
//    }

    // since the n numbers are from [0, n],
    // we can just add all the numbers from [0, n] together
    // and minus the sum of the n-1 numbers in array.
//    public static int missingNumber(int[] nums) {
//        int sum = nums.length;
//        for (int i = 0; i < nums.length; i++)
//            sum += i - nums[i];
//        return sum;
//    }
}
