import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        long sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("n 입력 = ");
            n = sc.nextInt();
        }while(n <= 0);
        for(int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println("총 = " + sum);
        sc.close();
    }
}
