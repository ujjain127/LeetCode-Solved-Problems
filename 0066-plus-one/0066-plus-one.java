class Solution {
    public int[] plusOne(int[] digits) {
           int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        
        // If we reach here, it means we need to add an additional digit (carry) at the beginning.
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        
        return newDigits;
    }
            
            

}

