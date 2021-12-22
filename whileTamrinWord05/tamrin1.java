package whileTamrinWord05;

import java.util.Scanner;

public class tamrin1 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه جدول ضرب 10 × 10 را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while ( i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.printf("%d\t", i);
                System.out.print(j);
                // ++j can be used.
                j++;
            }
            i++;
        }
    }
}
