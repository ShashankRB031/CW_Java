class MultiArray {
    int[][] MultiDA = new int[5][3];
    int[][] arr = {
        {56, 43, 6},
        {34, 7, 8},
        {12, 56, 8}
    };

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MulDArrary {
    public static void main(String[] args) {
        MultiArray obj = new MultiArray();
        obj.printArray();
    }
}
