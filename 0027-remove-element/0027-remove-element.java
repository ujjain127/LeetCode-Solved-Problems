class Solution {
    public int removeElement(int[] nums, int val) {
        int target = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[target] = nums[i];
                target++;
            }
        
        }
        return target;
    }
}