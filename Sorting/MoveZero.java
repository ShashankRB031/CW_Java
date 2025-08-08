public class MoveZero{
    static void moveZeroes(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < n-i-1 ; j++ ){
                if(arr[j] == 0 && arr[j+1] != 0 ){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main (String[] args){
        int[] arr = {2, 0, 4, 1, 0, 0};
        moveZeroes(arr);
        System.out.println("Array after moveing all zeroes at end ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}