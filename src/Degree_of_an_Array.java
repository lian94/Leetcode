import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Degree_of_an_Array {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap <Integer, List<Integer>>();
        int max=0;
        //Count the maximum frequency of nums[i]
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i],new ArrayList<Integer>());
            map.get(nums[i]).add(i);
            max=Math.max(max,map.get(nums[i]).size());
        }
        //Get the minimum length
        int min=nums.length;
        for(Map.Entry <Integer, List<Integer>> map1:map.entrySet()){
            if(map1.getValue().size()==max){
                //map1.getValue().get(map1.getValue().size()-1) is last index
                //map1.getValue().get(0) is the first index
                min=Math.min(min,map1.getValue().get(map1.getValue().size()-1)
                        -map1.getValue().get(0)+1);
            }
        }
        return min;
    }
}
