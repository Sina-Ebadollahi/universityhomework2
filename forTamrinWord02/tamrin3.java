package forTamrinWord02;

import java.util.Scanner;

public class tamrin3 {
    public static void main(String[] args) {
        // در كامپيوتري كه فقط عمل افزودن يك واحد به يك متغير وجود دارد دو عدد را  با يكديگر جمع كنيد بدين شكل كه يكي يكي بتواند به مقدار متغير اضافه شود.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' : ");
        int a = scanner.nextInt();
        System.out.println("Enter 'b' : ");
        int b = scanner.nextInt();
        int sum = a;
        for(int i = 0; i < b; i++){
            sum++;
        }
        System.out.println("sum is " + sum);

    }
}
