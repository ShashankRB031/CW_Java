public class InsertionSort{

    static void insertionSort(int[] arr){
        int n = arr.length;
        for( int i = 1 ; i< n ;  i++ ){
            int j =i;
            while(j > 0 && arr[j-1] > arr[j]){

                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr ={2, 1, 55, 6, 7, 9, 0};
        insertionSort(arr);
        System.out.print("Array after sorting : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}