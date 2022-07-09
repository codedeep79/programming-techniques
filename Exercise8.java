import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int n;
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        do {
            System.out.print("숫자 n을 입력하십시오: ");
            n = scanner.nextInt();
        } while (n < 1);
        for (int i = 0; i <= n; ++i) {
            sum += (float) 1.0 * (2 * i + 1)/(2 * i + 2);
        }
        System.out.println("총 = " + decimalFormat.format(sum));
    }

}
