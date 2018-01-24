public class Max_Chunks_To_Make_Sorted {
//    original: 0, 2, 1, 4, 3, 5, 7, 6
//    max:      0, 2, 2, 4, 4, 5, 7, 7
//    index:    0, 1, 2, 3, 4, 5, 6, 7
    public int maxChunksToSorted(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        //use max[] array to keep track of the max value until the current position
        int[] max = new int[arr.length];
        max[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max[i] = Math.max(max[i - 1], arr[i]);
        }
        //If the max[i] equals the element at index i in the sorted array
        //then the final count++
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max[i] == i) {
                count++;
            }
        }

        return count;
    }
}
