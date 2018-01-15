import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = (nums[i] - 1) % nums.length;
            nums[index] += nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 2 * nums.length)
                list.add(i + 1);
        }
        return list;
    }
}
