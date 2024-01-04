class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numset = new HashSet<>();
        for(int num : nums){
            if(numset.contains(num)){
                return true;
            }
            numset.add(num);
        }
        return false;
    }
}