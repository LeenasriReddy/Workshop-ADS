import java.util.HashMap;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (numIndices.containsKey(complement)) {
               return new int[]{numIndices.get(complement), i};
            }
           numIndices.put(num, i);
        }
       return new int[0];
    }public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);
        for (int index : result) {
            System.out.println(index); 
        }
    }
}
