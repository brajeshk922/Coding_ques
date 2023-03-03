// 27. Remove Element
// Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
// Note that the five elements can be returned in any order.
// It does not matter what you leave beyond the returned k (hence they are underscores).
// https://leetcode.com/problems/remove-element/description/

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int k=0;
        int s =0;
        int l=nums.length-1;
        while(s<=l){
            if(nums[s]==val){
                int temp = nums[s];
                nums[s]=nums[l];
                nums[l]=temp;
                l--;
            } else{
                s++;
                k++;
            }
        }
        System.out.println(k);
    }
    
}
