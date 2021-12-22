package whileTamrinWord04;

import java.util.Scanner;

public class tamrin2 {
    public static void main(String[] args) {
        // : الگوريتمي بنويسيد كه تعداد مقسوم عليه‌هاي يك عدد، بجز يك و خودش، را محاسبه
        // چاپ نمايد
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you preferred number :");
        int n = scanner.nextInt();
        int i = 2;
        while (i <= n / 2) {
            if ((n / 2) % i == 0) {
                System.out.println("Divisors are : " + i);
            }
            i++;
        }
    }
}
