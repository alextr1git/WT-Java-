package task7;

import java.util.Arrays;

public class task7 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shellSort(createArr())));
    }

    private static double[] createArr() {
        double[] arr = new double[]{1.2, 15, 12.69, 8.2, 2.3, 4, 8.56, 95.6, 13, 7.0};
        return arr;
    }

    public static double[] shellSort(double[] array) {
        int i = 0;
        while (i < array.length - 1){
            if (array[i] > array[i+1]){
                double temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                if(i > 0)
                    i--;
            }
            else {
                i++;
            }
        }
        return array;
    }

}
