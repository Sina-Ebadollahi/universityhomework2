package forTamrinWord04;

import java.util.Scanner;

public class tamrin7 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه حاصل جمع ارقام يك عدد را بدست آورد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int sum = 0;
        for(int a = scanner.nextInt();a > 0;a /= 10){
            int c = a % 10;
            sum += c;
        }
        System.out.println("sum of numbers is : " + sum);
    }
}
