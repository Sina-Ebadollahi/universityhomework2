package forTamrinWord05;

import java.util.Scanner;

public class tamrin4 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه an را با استفاده از كامپيوتري كه تنها عملگر جمع متغيرها را دارد را انجام دهد
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int pow = a;
        for(int i = 1; i < n; i++){
            int aux = pow;
            for(int j = 1; j < a; j++){
                pow += aux;
            }
        }
        System.out.println("powered number is : " + pow);
    }
}
