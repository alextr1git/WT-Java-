package task3;

public class Task3 {
    public static double function(double x){
    return Math.tan(x);
    }

    public static void main(String[] argc){
    double a = 0;
    double b = 5;
    double h = 1;
    System.out.println("x               F(x)");
    while (a <= b){
        System.out.printf("%.2f            %.2f\n", a, function(a));
        a += h;
    }
    }
}
