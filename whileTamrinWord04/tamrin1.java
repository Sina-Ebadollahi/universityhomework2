package whileTamrinWord04;

import java.util.Scanner;

public class tamrin1 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه عددي را گرفته و مشخص نمايد عدد اول است يا خير
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' :");
        int a = scanner.nextInt();
        int flag = 0;
        int i = 2;
        while ( i <= a / 2 ) {
            if (a % i == 0) {
                flag = 1;
            }
            i++;
        }
        if (flag == 0) {
            System.out.println("\tit's a prime number. ");
        } else {
            System.out.println("\tit's not a prime number.");
        }
    }
}
