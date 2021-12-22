package forTamrinWord03;

import java.util.Scanner;

public class tamrin4 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه عنصر nام سري فيبوناچي را محاسبه و چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int f1 = 1, f2 = 0;
        for (int i = 1; i < n; i++){
            int f = f1 + f2;
            f2 = f1;
            f1 = f;
        }
        System.out.println("the " + n + " index of the Fibonacci is : " + f1);
    }
}
