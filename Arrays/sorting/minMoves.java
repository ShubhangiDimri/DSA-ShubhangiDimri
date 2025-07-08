class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        insertionSort(seats);     //sorting both the arrays so that nearest possible seat mile hence minimum total movement
        insertionSort(students);  

        int totalMoves = 0;
        for (int i = 0; i < seats.length; i++) {
            totalMoves += Math.abs(seats[i] - students[i]);//positive value
        }

        return totalMoves;
    }

    private void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1); 
                } else {
                    break;
                }
            }
        }
    }

 
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
