package task5;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] initArr = createArr();

        System.out.println("Initial array:");
        Arrays.stream(initArr).forEach(value -> System.out.print(value + " "));
        int resultK = minKElem(initArr);
        System.out.println("\nK = " + resultK);
    }

    private static int[] createArr() {
        int[] arr = new int[]{1, 15, 12, 6, 2, 4, 8, 95, 13, 7};
        return arr;
    }

    private static int minKElem (int[] arr){
        int result = 0, currMax = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i + 1] <= currMax){
                result++;
            }
            else{
                currMax = arr[i + 1];
            }
        }
        return result;
    }
}
