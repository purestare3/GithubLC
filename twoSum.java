import java.util.*;
public class twoSum {
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args){
		int[] a={2,3,4,5};
		int[] b= twoSum(a, 9);
		for (int i= 0; i< b.length;i++){
			System.out.println(b[i]);
		}
	}
}
