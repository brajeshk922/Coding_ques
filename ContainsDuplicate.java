// Given an integer array nums and an integer k, return true 
// if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
// https://leetcode.com/problems/contains-duplicate-ii/
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,1};
        int k = 3;
        boolean ans = containsNearbyDuplicate(arr, k);
        System.out.println(ans);
    }
    
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                int key = mp.get(nums[i]);
                if ((i - key) <= k) {
                    return true;
                } else {
                    mp.put(nums[i], i);
                }
            } else {
                mp.put(nums[i], i);
            }

        }
        return false;
    }
}
