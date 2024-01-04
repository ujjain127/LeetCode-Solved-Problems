class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int i = 0;
        int j = -1;
        while( i < size){
            if(nums[i] == 0 && j == -1) j = i;
            else if(nums[i] != 0 && j != -1){
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
            i++;
        }
    }
}