public class Array_Nesting {
    //It is a circle when every equivalent S[k] happens
    //For array 5 4 0 3 1 6 2
    //S[0] = S[2] = S[5] = S[6]
    public int arrayNesting(int[] nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            int count = 0;
            while (nums[index] >= 0) {
                int newIndex = nums[index];
                nums[index] = -1;
                index = newIndex;
                count++;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
