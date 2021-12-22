package forTamrinWord04;

import java.util.Scanner;

public class tamrin8 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه سينوس زاويه x را با استفاده از بسط تيلور تا جمله nام محاسبه نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'x' Professor Pirahesh");
        int x = scanner.nextInt();
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int sin = 0, a = x, c = 1;
        for(int i = 0; i < n; i++){
            sin += a;
            c += 2;
            a = a * (-1) * x * x / (c * (c - 1));
        }
        System.out.println("answer of Sinus is : " + sin);
    }
}
