public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(nums[j] == 0)
            j ++;
        if(j < nums.length){
            while(j < nums.length){
                while(nums[j] == 0)
                    j ++;
                while(nums[i] != 0)
                    i ++;
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }

    }

//    public void moveZeroes(int[] nums){
//        int index=0;
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]!=0) nums[index++]=nums[i];
//        }
//        while(index<nums.length){
//            nums[index++]=0;
//        }
//    }
}
