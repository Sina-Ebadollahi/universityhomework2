package whileTamrinWord02;

import java.util.Scanner;

public class tamrin6 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه كه اعداد زوج طبيعي كوچكتر مساوي n را چاپ نمايد
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'n' :");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println("even numbers : " + i);
            }
            i++;
        }
    }
}
