package doWhileTamrinWord05;

import java.util.Scanner;

public class doWhile3 {
    public static void main(String[] args) {
        // الگوريتمي بنوسيد كه عمل ضرب دو عدد را با استفاده از كامپيوتري كه تنها عملگر افزايش يك واحد به متغيرها دارد را انجام دهد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        System.out.println("Enter 'b' Professor Pirahesh");
        int b = scanner.nextInt();
        int product = a;
        int i = 1;
        do{
            int j = 0;
            do{
                product += 1;
                j++;
            }while(j < a);
            i++;
        }while(i < b);
        System.out.println("answer is : "  + product);
    }
}
