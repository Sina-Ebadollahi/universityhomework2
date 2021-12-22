package forTamrinWord02;

import java.util.Scanner;

public class tamrin1 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه اعداد طبيعي كوچكتر مساوي n را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'n' Professor Pirahesh!");
        int n = scanner.nextInt();
        for(int i = 1; i < n;i++){
            System.out.printf("Numbers are %d\n", i);
        }
    }
}
