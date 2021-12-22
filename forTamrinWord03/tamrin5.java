package forTamrinWord03;

import java.util.Scanner;

public class tamrin5 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه عناصر سري فيبوناچي كه كوچكتر مساوي عدد n مي‌باشند را محاسبه و چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int f1 = 1, f2 = 0;
        for(int i = 1; i <= n; i++){
            int f = f1 + f2;
            System.out.println("numbers are " + f);
            f2 = f1;
            f1 = f;
        }
    }
}
