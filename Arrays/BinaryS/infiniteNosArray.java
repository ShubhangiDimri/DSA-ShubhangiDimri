
// finds an element in an array of infinite size

class solution {
  
    static int binarySearch(int[] arr, int target,
                            int start, int end) {
        while (start <= end) {
  
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int findPos(int[] arr, int target) {
      
        // Initialize start and end for the search range
        int start = 0;
        int end = 1;

        while (target > arr[end]) {

            int newStart = end + 1;

            // Double the box size and update the end index
            end = end + (end - start + 1) * 2;  //end=prev end+size of box*2

            // Update start to the old end + 1
            start = newStart;
        }

        // Perform binary search within the found range
        return binarySearch(arr, target, start, end);
    }

    public static void main(String[] args) {
      
        int[] arr = { 3, 5, 7, 9, 10, 90,
                      100, 130, 140, 160, 170 };

        int target = 10;
        int ans = findPos(arr, target);
        System.out.println(ans);
    }
}
