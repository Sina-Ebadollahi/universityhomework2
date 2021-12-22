package forTamrinWord03;

import java.util.Scanner;

public class tamrin6 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه عناصر سري فيبوناچي مابين اعداد m و n را محاسبه و چاپ نمايد(بزرگتر مساوي m و كوچكتر مساوي n)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'm' Professor Pirahesh");
        int m = scanner.nextInt();
        System.out.println("Enter the 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        // to be sure that the n is bigger than m
        if(n < m){
            int swapVar = m;
            m = n;
            n = swapVar;
        }
        int f1 = 1, f2 = 0;
        for(;m <= n; m++){
            int f = f1 + f2;
            System.out.println("numbers are : " + f);
            f2 = f1;
            f1 = f;
        }
    }
}
