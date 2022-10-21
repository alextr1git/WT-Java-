package task8;

public class task8 {
    public static void main(String[] args) {
        printLocationInsert(new double[]{1,2,3,3,4,4,5,5,11}, new double[]{-1,3,4,4,5,5,5,6,7,7,9,9,9});
    }

    private static void printLocationInsert(double [] array1, double [] array2) {
        for (int i = 0; i < array1.length; i++) {
            boolean flagIns = true;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] < array2[j]) {
                    System.out.printf("%d элемент первого массива вставим до %d элем. второго\n", i, j);
                    flagIns = false;
                    break;
                }
            }
            if (flagIns)
                System.out.printf("%d элемент первого массива вставим после последенго элем. второго\n", i);
        }
    }
}
