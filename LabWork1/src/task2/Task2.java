package task2;

public class Task2 {
    public static String checker(int x, int y){
        if ((y >= 0 && y <= 5 && x >= -4 && x <= 4) || (y < 0 && y >= -3 && x >= -4 && x <= 6)){
            return "true";
        }
        else {
            return "false";
        }
    }

    public static void main (String[] argc){
        int x = 3;
        int y = -2;
        System.out.println(checker(x,y));
    }

}
