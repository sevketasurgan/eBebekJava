package Giris;

import java.util.Scanner;

public class sumFour {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz : ");
            n = in.nextInt();

            if(n % 2 == 0 || n % 4 == 0)
                total += n;

        }while(n %2 == 0);
        System.out.print("Toplam : " + total);
    }
}
