package Chapter4;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
//      int[] arr2 = new int[3] {1,2,3}; //Error
        int[] arr3 = new int[] {1,2,3};
        int[] arr4 = {1,2,3};

        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[2];

        int[] arrTest = {1,2,3,4,5};
        int[] arrCopy = new int[5];
    }
}
