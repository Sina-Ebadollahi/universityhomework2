package forTamrinWord02;

import java.util.Scanner;

public class tamrin4 {
    public static void main(String[] args) {
        // در كامپيوتري كه مدار ضرب كننده ندارد حاصلضرب دو عدد را با جمع‌هاي متوالي بدست آوريد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        System.out.println("Enter 'b' Professor Pirahesh");
        int b = scanner.nextInt();
        int product = a;
        // a * b = a + a + a + ... + a
        for(int i = 1; i < b; i++){
            product += a;
        }
        System.out.println("Product is : " + product);
    }
}
