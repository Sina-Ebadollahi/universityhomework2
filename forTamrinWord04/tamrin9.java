package forTamrinWord04;

import java.util.Scanner;

public class tamrin9 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه سينوس زاويه x را با استفاده از بسط تيلور تا دقت p محاسبه نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'x' Professor Pirahesh");
        int x = scanner.nextInt();
        System.out.println("Enter 'p' Professor Pirahesh");
        int p = scanner.nextInt(), sin = 0, a = x, c = 1;
        for(;Math.abs(a) >= p;){
            c += 2;
            a = a * (-1) * x * x / (c * (c - 1));
        }
        System.out.println("answer of the Sinus with " + p + " accuracy is : " + sin);
    }
}
