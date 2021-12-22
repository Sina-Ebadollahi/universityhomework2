package whileTamrinWord02;

import java.util.Scanner;

public class tamrin4 {
    public static void main(String[] args) {
        // در كامپيوتري كه مدار ضرب كننده ندارد حاصلضرب دو عدد را با جمع‌هاي متوالي بدست
        // آوريد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' :");
        int a = scanner.nextInt();
        System.out.println("Enter 'b' :");
        int b = scanner.nextInt();
        int product = a;
        // a * b = a + a + a + ... + a
        int i = 1;
        while (i < b) {
            product += a;
            i++;
        }
        System.out.println("Product is : " + product);
    }
}
