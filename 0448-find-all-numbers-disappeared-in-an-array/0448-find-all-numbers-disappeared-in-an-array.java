class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                ans.add(i+1);
            }
        }
        return ans;
}
    
void swap(int[] nums, int first, int second){
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
}
    
}