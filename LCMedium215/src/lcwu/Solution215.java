package lcwu;

import java.util.ArrayList;
import java.util.Collections;

public class Solution215 {
	public int findKthLargest(int[] nums, int k) {
		ArrayList<Integer>res = new ArrayList<>();
		if(nums==null)return 0;
		for (int i = 0; i <nums.length ; i++)
			res.add(nums[i]);
		Collections.sort(res,(o1,o2)->o2-o1);
		return res.get(k-1);
	}
}
