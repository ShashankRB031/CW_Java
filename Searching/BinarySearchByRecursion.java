
public class BinarySearchByRecursion {

    static boolean recBinarySearch(int[] arr, int start, int end, int target) {

        if (start > end) {
            return false;
        }
        int mid = (start +(end - start) )/ 2;
        if (target == arr[mid]) {
            return true;

        } else if (target < arr[mid]) {
            return recBinarySearch(arr, start, mid - 1, target);
        } else {
            return recBinarySearch(arr, mid + 1, end, target);
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6,};
        int target = 2;
        boolean found = recBinarySearch(arr, 0, arr.length - 1, target);
        System.out.println(found ? "found" : "not found ");

    }
}
