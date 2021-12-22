package whileTamrinWord04;

import java.util.Scanner;

public class tamrin10 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه كسينوس زاويه x را با استفاده از بسط تيلور تا دقت p
        // محاسبه نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'x' :");
        int x = scanner.nextInt();
        System.out.println("Enter 'p' :");
        int p = scanner.nextInt(), c = 2, a = x, cos = 0;
        while (p <= Math.abs(a)) {
            cos += a;
            c += 2;
            a = a * (-1) * x / (c * c);
        }
        System.out.println("answer of Cousins is : " + cos);
    }
}
