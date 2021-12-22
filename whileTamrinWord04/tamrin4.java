package whileTamrinWord04;

import java.util.Scanner;

public class tamrin4 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه تمامي مقسوم عليه‌هاي يك عدد را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 1;
        while (i <= a) {
            if (a % i == 0) {
                System.out.println("numbers are : " + i);
            }
            ++i;
        }
    }
}
