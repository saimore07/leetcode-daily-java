import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // store elements of first array
        for (int num : nums1) {
            set.add(num);
        }

        // check intersection
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // convert set to array
        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}