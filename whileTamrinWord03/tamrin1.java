package whileTamrinWord03;

import java.util.Scanner;

public class tamrin1 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه تا عنصر nام سري فيبوناچي را محاسبه و چاپ نمايد. (در
        // اعداد يا سري فيبوناچي غیر از دو عدد اول، اعداد بعدی از جمعِ دو عددِ قبلیِ خود
        // بدست می‌آیند).
        Scanner scanner = new Scanner(System.in);
        int n, f1, f2;
        System.out.println("Enter 'n' :");
        n = scanner.nextInt();
        f1 = 1;
        f2 = 0;
        // example of Fibonacci : 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
        int index = 1;
        while (index < n) {
            int f = f1 + f2;
            System.out.println("index is " + index + " & number is " + f);
            f2 = f1;
            f1 = f;
            index++;
        }
    }
}
