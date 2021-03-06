package p78_子集;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null) return res;
        subsetsHelper(res, nums, new ArrayList<Integer>(), 0);
        return res;
    }

    private void subsetsHelper(List<List<Integer>> res, int[] nums, ArrayList<Integer> list, int index) {
        // terminator
        if (index == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        // not pick the number at this index
        subsetsHelper(res, nums, (ArrayList<Integer>) list.clone(), index + 1);
        list.add(nums[index]);
        // pick the number at this index
        subsetsHelper(res, nums, (ArrayList<Integer>) list.clone(), index + 1);
    }
}
