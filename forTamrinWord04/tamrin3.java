package forTamrinWord04;

import java.util.Scanner;

public class tamrin3 {
    public static void main(String[] args) {

        // الگوريتمي بنويسيد كه عددي را گرفته و مشخص كند عدد كامل است يا نه. عدد كامل عدديست كه مجموع مقسوم عليه‌هاي بجز خودش مساوي خود عدد باشد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your preferred number Professor Pirahesh");
        int n = scanner.nextInt();
        int answer = calcFunc(n);
        if(answer == n){
            System.out.println("this number : " + n + " is a prime number");
        }
    }
    public static int calcFunc(int n){
        int counter = 0, sum = 0;
        for(int i = 1; i < n; i++){
            if((n % i) == 0){
                counter++;
                sum += 1;
                System.out.println(sum);
            }
        }
        System.out.printf("amount of divisors are : %d", counter);
        return sum;
    }
}
