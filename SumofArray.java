
class Add{
    void sumArray(){
        int arr [] ={1,2,3,4,5};
        int sum =0;

        for(int i=0; i<arr.length; i++){
           sum = sum + arr[i];

        }
        System.out.println(sum);

    }
}
public class SumofArray {
    public static void main (String args[]){
        Add sum =new Add();
        sum.sumArray();

    }
}
