import java.util.Formatter;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        double x, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("기본 x를 입력하십시오. ");
        x = scanner.nextDouble();
        System.out.print("지수 n을 입력하십시오: ");
        n = scanner.nextDouble();
        System.out.println(new Formatter().format("%.5f ^ %.5f",x,n) + " = " + Math.pow(x,n));
    }
}
