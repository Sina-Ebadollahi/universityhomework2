package whileTamrinWord02;

import java.util.Scanner;

public class tamrin2 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه n عدد را از ورودي گرفته حاصلجمع و ميانگين آنها را محاسبه
        // و چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int numbersOfInput = scanner.nextInt();
        int sumValueOfInputs = 0;
        int i = 1;
        while (i <= numbersOfInput) {

            System.out.print("enter " + i + " number : ");
            int tempInput = scanner.nextInt();
            sumValueOfInputs += tempInput;
            i++;
        }
        int avgValueOfInputs = sumValueOfInputs / numbersOfInput;
        System.out.println("sum is : " + sumValueOfInputs + " & average is : " + avgValueOfInputs);
    }
}
