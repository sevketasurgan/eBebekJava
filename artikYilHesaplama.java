package Giris;

import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String[] args) {
        int year;
        String result;

        // get inputs from user
        Scanner in = new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        year = in.nextInt();

        // calculating process
        result = ((year % 4 == 0) || (year % 400 == 0)) ? "Artık Yıldır.": "Artık Yıl Değildir.";
        System.out.print(year + " yılı "+ result);
    }
}
