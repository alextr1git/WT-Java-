package task1;

public class Task1 {

    public static double countExpression(int x, int y){
        double z=(1+Math.pow(Math.sin(x+y),2))/(2+Math.abs(x-(2*x/(1+x*x*y*y)))) + x;
        return z;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.printf("Answer is %.3f", countExpression(x,y));
    }

}
