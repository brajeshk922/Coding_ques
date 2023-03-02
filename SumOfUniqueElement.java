import java.util.*;

public class SumOfUniqueElement {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,2};
        Map<Integer,Integer> mp =  new HashMap<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            } else {
                mp.put(nums[i],1);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(mp.get(nums[i])==1){
                sum+=nums[i];
            }
        }
        System.out.println(sum);
    }
    
}
