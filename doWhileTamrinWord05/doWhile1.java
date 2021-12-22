package doWhileTamrinWord05;
import java.util.Scanner;
public class doWhile1 {
    public static void main(String[] args) {
        //الگوريتمي بنويسيد كه جدول ضرب 10 × 10   را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int j = 1;
        do{
            do {
                System.out.printf("%d\t",i * j);
                j++;
            }while(j <=  10);
            i++;
        }while(i <= 10);
    }
}

