import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int lost = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != lost && nums[i] != nums[i-1]){
                list.add(lost);
            }
            lost ++;
        }
        return list;
    }

//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> res = new ArrayList<>();
//        int n = nums.length;
//        for (int i = 0; i < nums.length; i ++) nums[(nums[i]-1) % n] += n;
//        for (int i = 0; i < nums.length; i ++) if (nums[i] <= n) res.add(i+1);
//        return res;
//    }
    //4,3,2,7,8,2,3,1 => 12,19,18,15,16,2,3,9


//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> ret = new ArrayList<Integer>();
//
//        for(int i = 0; i < nums.length; i++) {
//            int val = Math.abs(nums[i]) - 1;
//            if(nums[val] > 0) {
//                nums[val] = -nums[val];
//            }
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] > 0) {
//                ret.add(i+1);
//            }
//        }
//        return ret;
//    }
    //4,3,2,7,8,2,3,1 => -4,-3,-2,-7,8,2,-3,-1
}
