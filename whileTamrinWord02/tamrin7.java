package whileTamrinWord02;

import java.util.Scanner;

public class tamrin7 {
    public static void main(String[] args) {
        // الگوریتمی بنویسید که حاصل توان دو عدد را با استفاده از ضرب‌هاي متوالي بدست
        // آوريد.
        int a, b, pow, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' :");
        a = scanner.nextInt();
        System.out.println("Enter 'b' :");
        b = scanner.nextInt();
        pow = a;
        // a**b
        i = 1;
        while (i < b) {
            pow *= a;
            i++;
        }
        System.out.println("calculated power of 'a' is " + pow);
    }
}
