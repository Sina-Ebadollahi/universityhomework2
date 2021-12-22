package whileTamrinWord04;

import java.util.Scanner;

public class tamrin8 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه سينوس زاويه x را با استفاده از بسط تيلور تا جمله nام
        // محاسبه نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'x' :");
        int x = scanner.nextInt();
        System.out.println("Enter 'n' :");
        int n = scanner.nextInt();
        int sin = 0, a = x, c = 1, i = 0;
        while (i < n) {
            sin += a;
            c += 2;
            a = a * (-1) * x * x / (c * (c - 1));
            ++i;
        }
        System.out.println("answer of Sinus is : " + sin);
    }
}
