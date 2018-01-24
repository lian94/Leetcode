import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }

//    final Set<Integer> distinct = new HashSet<Integer>();
//    for(int num : nums) {
//        if(distinct.contains(num)) {
//            return true;
//        }
//        distinct.add(num);
//    }
//    return false;
}
