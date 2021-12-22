package forTamrinWord04;

import java.util.Scanner;

public class tamrin4 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه تمامي مقسوم عليه‌هاي يك عدد را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                System.out.println("numbers are : " + i);
            }
        }
    }
}
