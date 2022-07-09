import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        double sum = 0, x;
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("숫자 n을 입력하십시오: ");
            n = scanner.nextInt();
        } while (n < 1);
        System.out.print("기본 x를 입력하십시오: ");
        x = scanner.nextDouble();
        for(int i = 1;i <= n;++i)
        {
            sum += Math.pow(x, 2 * i);
        }
        System.out.println("총 = " + sum);
    }
}
