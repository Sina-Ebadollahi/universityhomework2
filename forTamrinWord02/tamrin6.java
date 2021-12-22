package forTamrinWord02;

import java.util.Scanner;

public class tamrin6 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه كه اعداد زوج طبيعي كوچكتر مساوي n را چاپ نمايد
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println("even numbers : " + i);
            }
        }
    }
}
