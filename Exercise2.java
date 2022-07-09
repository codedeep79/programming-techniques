import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        long sum = 0;
        int n, count = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("숫자 n을 입력하십시오: ");
            n = sc.nextInt();
        }while(n < 1);
        for (int i = 1; i <= n; ++i) {
            count *= i;
            sum += count;
        }
        System.out.println("총 = " + sum);
    }

}
