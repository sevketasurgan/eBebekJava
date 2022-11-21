package Giris;

import java.util.Scanner;

public class basamakSayisi {
    public static void main(String[] args) {

        int n, digitNum = 0, result = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        n = in.nextInt();

        while (n != 0) {
            digitNum = n % 10;
            n /= 10;
            result += digitNum;
        }
        System.out.println(result);


    }
}
