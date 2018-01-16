public class Product_of_Array_Except_Self {
    //scan the array twice, a product of nums[i] = left * right
    //Numbers:     2    3    4     5
    //Lefts:       1    2  2*3 2*3*4
    //Rights:  3*4*5  4*5    5     1
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int product = 1;
        ans[0] = 1;
        for (int i = 0; i < n - 1; i++) {
            product *= nums[i];
            ans[i+1] = product;
        }
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= product;
            product *= nums[i];
        }
        return ans;
    }
}
