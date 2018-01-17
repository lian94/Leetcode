import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {
    /**
     * [1]->[1,2]->[1,2,3]. Since now sum is not 9, no more backtracking,
     * so after list.remove(list.size() - 1), it is [1,2].
     * Then next follows [1,2,4], sum is not 9, repeat process above untill [1,2,6].
     * When go to next backtracking, the list will be added to result,
     * and for this list, no more backtracking.
     * Now we can go back to a previous backtracking, which is [1,3]->[1,3,4], fail.
     * [1,4,]->[1,4,5], fail. And so one.
     * @param k
     * @param n
     * @return
     */
    public static List<List<Integer>> combinationSum3(int k, int n) {
//        int[] num = {1,2,3,4,5,6,7,8,9};
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        helper(result, new ArrayList<Integer>(), num, k, n,0);
//        return result;
        List<List<Integer>> ans = new ArrayList<>();
        combination(ans, new ArrayList<Integer>(), k, 1, n);
        return ans;
    }

    public void helper(List<List<Integer>> result, List<Integer> list, int[] num, int k, int target, int start) {
        if (k == 0 && target == 0) {
            result.add(new ArrayList<Integer>(list));
        } else {
            for (int i = start; i < num.length && target > 0 && k > 0; i++) {
                list.add(num[i]);
                helper(result, list, num, k - 1, target - num[i], i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        combinationSum3(3,6);
    }

    private static void combination(List<List<Integer>> ans, List<Integer> comb, int k,  int start, int n) {
        if (comb.size() > k) {
            return;
        }
        if (comb.size() == k && n == 0) {
            //copy comb to a new memory space li
            //otherwise ans will be modified when comb be modified later
            List<Integer> li = new ArrayList<Integer>(comb);
            ans.add(li);
            return;
        }
	    for (int i = start; i <= 9; i++) {
            comb.add(i);
            combination(ans, comb, k, i+1, n-i);
            System.out.println(comb);
            comb.remove(comb.size() - 1);
        }
    }
}
