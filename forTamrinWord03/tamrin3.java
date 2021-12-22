package forTamrinWord03;

import java.util.Scanner;

public class tamrin3 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه n! را محاسبه نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int fact = 1;
        // n! = 1 * 2 * ... * n
        for(int k = 1; k <= n; k++){
            fact *= k;
        }
        System.out.println("factorial is : " + fact);
    }
}
