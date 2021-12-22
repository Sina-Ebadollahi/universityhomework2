package whileTamrinWord04;

import java.util.Scanner;

public class tamrin7 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه حاصل جمع ارقام يك عدد را بدست آورد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' :");
        int a = scanner.nextInt();
        int sum = 0;
        while (a > 0) {
            int c = a % 10;
            sum += c;
            a /= 10;
        }
        System.out.println("sum of numbers is : " + sum);
    }
}
