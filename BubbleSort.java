public class BubbleSort {

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++ ){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void main (String[] args){

        int[] arr = {2, 9, 4, 8 , 0};
        bubbleSort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
