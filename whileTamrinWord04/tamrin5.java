package whileTamrinWord04;

import java.util.Scanner;

public class tamrin5 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه حاصل ay را با تعداد گردش 〖log〗_2^y محاسبه نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'y' : ");
        int y = scanner.nextInt();
        System.out.println("Enter 'a' : ");
        int a = scanner.nextInt();
        double d = Math.floor(Math.log(y) / Math.log(2)) + 1;
        int s = 1;
        while (d > 0) {
            s *= s;
            if ((y & (int) Math.pow(2, d - 1)) != 0) {
                s *= a;
            }
            d--;
        }
        System.out.println("answer is : " + (int) s);
    }
}
