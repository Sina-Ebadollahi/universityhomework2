package doWhileTamrinWord05;

import java.util.Scanner;

public class doWhile5 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه an را با استفاده از كامپيوتري كه تنها عملگر افزايش يك واحد به متغيرها دارد را انجام دهد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int pow = a;
        int i = 1;
        do{
            int aux = pow;
            int j = 1;
            do{
                for(int k = 1; k <= aux; k++){
                    pow += 1;
                }
                j++;
            }while(j < a);
            i++;
        }while(i < n);
        System.out.println("powered number is : " + pow);
    }
}