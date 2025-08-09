public class BinarySearch {

    static boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) { // compare with value, not index
                return true;
            } 
            else if (target < arr[mid]) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 2;

        boolean found = binarySearch(arr, target);
        System.out.println(found ? "Found" : "Not Found");
    }
}
