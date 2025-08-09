public class Problem2 {

    static void displayArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void sortArray(int[] arr){
        int n = arr.length;
        int l = 0, r = n - 1;

        while (l < r) {
            while (l < n && arr[l] < 0) l++;
            while (r >= 0 && arr[r] >= 0) r--;

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, -2, 3, -9, 8, 0, 1, -66};

        System.out.println("Before : ");
        displayArr(arr);

        System.out.println("After : ");
        sortArray(arr);
        displayArr(arr);
    }
}
