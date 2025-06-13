// class Solution {
//     public int[] buildArray(int[] nums) {
//         int[] ans=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             ans[i]=nums[nums[i]];
//         }
//         return ans;
//     }
// }
//without using extra space
class Solution{
public int[] buildArray(int[] nums) {
    int n = nums.length;

    // Encode both old and new value
    for (int i = 0; i < n; i++) {
        nums[i] = nums[i] + (nums[nums[i]] % n) * n;
    }

    //  Extraction of the new value
    for (int i = 0; i < n; i++) {
        nums[i] = nums[i] / n;
    }

    return nums;
}
}
