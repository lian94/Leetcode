import com.sun.org.apache.xpath.internal.operations.And;
import javafx.beans.binding.When;

import java.util.Arrays;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
//    When count != 0 , it means nums[1…i] has a majority, which is major in the solution.
//    When count == 0 , it means nums[1…i ] doesn’t have a majority,
//    so nums[1…i ] will not help nums[1…n]. And then we have a subproblem of nums[i+1…n].
//    public int majorityElement(int[] num) {
//
//        int major=num[0], count = 1;
//        for(int i=1; i<num.length;i++){
//            if(count==0){
//                count++;
//                major=num[i];
//            }else if(major==num[i]){
//                count++;
//            }else count--;
//        }
//        return major;
//    }
}
