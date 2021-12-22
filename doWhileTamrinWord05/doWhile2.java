package doWhileTamrinWord05;
import java.util.Scanner;
public class doWhile2 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه n عدد را از ورودي گرفته مشخص نمايد هركدام از آنها عدد اول هستند يا خير.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int i = 0;
        do{
            int a = scanner.nextInt();
            int flag = 0;
            int j = 2;
            do{
                if(a % j == 0){
                    flag = 1;
                    System.out.println("this number is " + a + " and it's a prime number");
                }else{
                    System.out.println("its not a prime number");
                }
                j++;
            }while(j <= a/2);
            i++;
        }while(i < n);
    }
}
