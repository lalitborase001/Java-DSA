import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(nums,0,list,result);
        return result;
    }
    public static void backtrack(int[] nums, int index,List<Integer> list,List<List<Integer>> result) {
        result.add(new ArrayList<>(list));
        for(int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(nums, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}
