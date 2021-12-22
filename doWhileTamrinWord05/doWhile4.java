package doWhileTamrinWord05;

import java.util.Scanner;

public class doWhile4 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه an را با استفاده از كامپيوتري كه تنها عملگر جمع متغيرها را دارد را انجام دهد
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
                pow += aux;
                j++;
            }while(j < a);
            i++;
        }while(i < n);
        System.out.println("powered number is : " + pow);
    }
}
