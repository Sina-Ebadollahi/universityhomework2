package whileTamrinWord04;

import java.util.Scanner;

public class tamrin3 {
    public static void main(String[] args) {

        // الگوريتمي بنويسيد كه عددي را گرفته و مشخص كند عدد كامل است يا نه. عدد كامل
        // عدديست كه مجموع مقسوم عليه‌هاي بجز خودش مساوي خود عدد باشد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your preferred number :");
        int n = scanner.nextInt();
        int answer = calcFunc(n);
        if (answer == n) {
            System.out.println("this number : " + n + " is a prime number");
        }
    }

    public static int calcFunc(int n) {
        int counter = 0, sum = 0;
        int i = 1;
        while (i < n) {
            if ((n % i) == 0) {
                counter++;
                sum += 1;
                System.out.println(sum);
            }
            ++i;
        }
        System.out.printf("amount of divisors are : %d", counter);
        return sum;
    }
}
