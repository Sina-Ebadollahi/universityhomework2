package whileTamrinWord02;

import java.util.Scanner;

public class tamrin1 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه اعداد طبيعي كوچكتر مساوي n را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'n' :!");
        int n = scanner.nextInt();
        int i = 1;
        while (i < n) {
            System.out.printf("Numbers are %d\n", i);
            i++;
        }
    }
}
