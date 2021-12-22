package whileTamrinWord05;

import java.util.Scanner;

public class tamrin4 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه an را با استفاده از كامپيوتري كه تنها عملگر جمع متغيرها
        // را دارد را انجام دهد
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
                pow += aux;
                j++;
            }
            ++i;
        }
        System.out.println("powered number is : " + pow);
    }
}
