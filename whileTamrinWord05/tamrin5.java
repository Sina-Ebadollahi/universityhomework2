package whileTamrinWord05;

import java.util.Scanner;

public class tamrin5 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه an را با استفاده از كامپيوتري كه تنها عملگر افزايش يك
        // واحد به متغيرها دارد را انجام دهد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int pow = a, i = 1;
        while (i < n) {
            int aux = pow;
            int j = 1;
            while (j < a) {
                int k = 1;
                while (k <= aux) {
                    pow += 1;
                    k++;
                }
                j++;
            }
            ++i;
        }
        System.out.println("powered number is : " + pow);
    }
}
