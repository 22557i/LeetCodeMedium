package lcwu;
import java.util.*;
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List res = new ArrayList();

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i + 1; j <nums.length ; j++) {
                for (int k = j + 1; k <nums.length ; k++) {
                    if(nums[i]+nums[j]+nums[k]==0);
                    {
                        ArrayList temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        res.add(temp);
                    }
                }
            }
        }
        return  res;
    }
}
