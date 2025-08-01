class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);    // Reverse whole array
        reverse(nums, 0, k - 1);    // Reverse first k elements
        reverse(nums, k, n - 1);    // Reverse the rest
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
