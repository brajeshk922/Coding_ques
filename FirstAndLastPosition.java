// 34. Find First and Last Position of Element in Sorted Array
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int f =0;
        int l =nums.length-1;
        int[] res = new int[]{-1,-1};
        while(f<=l){
            if(nums[f]==target && res[0] == -1){
                res[0] = f;   
                l++;
            } else if(nums[l]== target && res[0] != -1){
                res[1] = l;
                break;
            }

            if(res[0]==-1){
                f++;
            } else{
                l--;
            }
        }
        System.out.println(res[0]+" , "+res[1]);
    }
}
