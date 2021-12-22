package forTamrinWord04;

import java.util.Scanner;

public class tamrin6 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه مقلوب يك عدد را بدست آورد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to reverse it");
        int inputValue = scanner.nextInt();
        int res = 0;
        while(inputValue > 0){
            int c = inputValue % 10;
            res = res * 10 + c;
            inputValue /= 10;
        }
        System.out.println("the reversed answer is : " + res);
    }
}
