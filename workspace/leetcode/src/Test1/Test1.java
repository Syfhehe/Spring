package Test1;

import java.util.HashMap;

class Test1 {
	
	//O(n^2)的时间复杂度
	public static int[] twoSum(int[] nums, int target) {
		int[] results = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					results[0] = i;
					results[1] = j;
					break;
				}
			}
		}
		return results;
	}
	
	//时间复杂度O(n)
	public int[] twoSum2(int[] nums, int target) {
	    int[] answer = new int[2];
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; ++i){
	        map.put(nums[i], i);// value -- key
	    }
	    for (int i = 0; i < nums.length; ++i){
	        int b = target - nums[i];
	          if (map.containsKey(b) && i != map.get(b))//不是本身，但是是满足相加等于target的条件
	              return new int[]{i, map.get(b)};
	     }
	     return answer;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7 };
		twoSum(input, 9);
	}
}
