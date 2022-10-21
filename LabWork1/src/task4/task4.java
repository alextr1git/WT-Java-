package task4;

import java.math.BigInteger;

public class task4 {
    public static void main(String[] args) {
        isPrime();
    }

    private int[] createArr() {
            int[] arr = new int[]{1, 15, 12, 6, 2, 4, 8, 95, 13, 7};
            return arr;
    }
    private static void isPrime(){
        task4 obj = new task4();
        int arr[] = obj.createArr();
        BigInteger bigInteger;
        for (int i = 0; i< arr.length; i++){
            bigInteger = BigInteger.valueOf(arr[i]);
            if (bigInteger.isProbablePrime((int) Math.log(arr[i]))){
                System.out.println("[" + i + "] = " + arr[i] + " is prime.");
            }
        }
    }
}
