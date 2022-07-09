import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int n;
        long sum = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("숫자 n을 입력하십시오: ");
            n = scanner.nextInt();
        } while (n < 1);
        for (int i = 1; i <= n; ++i) {
            sum *= i;
        }
        System.out.println("총 = " + sum);
    }

}
