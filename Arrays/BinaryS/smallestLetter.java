class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (letters[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        // If low is beyond the last index, wrap around
        return letters[low % letters.length];//low==N suppose sizeof the array is 4 then 4%4=0.
    }
}
