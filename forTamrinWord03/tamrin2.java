package forTamrinWord03;

import java.util.Scanner;

public class tamrin2 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه مربع (n2) اعداد طبيعي كوچكتر مساوي n را بدون ضرب بدست آورد: (در اين روش مربع قبلي با عدد فردي كه به ترتيب افزايش پيدا ميكنند جمع مي‌گردد و مربع بعدي بدست مي‌آيد)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        for(int i = 0; i < n; ++i){
            a += b;
            System.out.println("to powered numbers that are smaller than " + n +" which is " + i + " are : " + a);
            b += 2;
        }

    }
}
