import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        int n;
        double sum = 0, sum1 = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("숫자 n을 입력하십시오: ");
            n = scanner.nextInt();
        } while (n < 1);
        for (int i = 1; i <= n; ++i) {
            sum += i;
            sum1 += 1/sum;
        }
        System.out.println("총 = " + sum1);
    }
}
