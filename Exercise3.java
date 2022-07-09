import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int n;
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        do {
            System.out.print("숫자 n을 입력하십시오: ");
            n = scanner.nextInt();
        } while (n < 1);
        for (int i = 1; i <= n; ++i) {
            sum += (float) 1/i;
        }
        System.out.println("총 = " + decimalFormat.format(sum));
    }

}
