package whileTamrinWord03;

import java.util.Scanner;

public class tamrin3 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه n! را محاسبه نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' :");
        int n = scanner.nextInt();
        int fact = 1;
        // n! = 1 * 2 * ... * n
        int k = 1;
        while (k <= n) {
            fact *= k;
            ++k;
        }
        System.out.println("factorial is : " + fact);
    }
}
