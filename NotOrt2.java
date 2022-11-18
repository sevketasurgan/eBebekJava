package Giris;

import java.util.Scanner;

public class NotOrt2 {
    public static void main(String[] args) {
        // Initialize variables
        int mat, fiz, tur, tar, kim, muz;

        // Calling scanner object
        Scanner input = new Scanner(System.in);

        // get inputs from user
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        mat = mat > 0 && mat < 100 ? mat : 0;

        System.out.print("Fizik Notunuz : ");
        fiz = input.nextInt();
        fiz = fiz > 0 && fiz < 100 ? fiz : 0;

        System.out.print("Turkce Notunuz : ");
        tur = input.nextInt();
        tur = tur > 0 && tur < 100 ? tur : 0;

        System.out.print("Tarih Notunuz : ");
        tar = input.nextInt();
        tar = tar > 0 && tar < 100 ? tar : 0;

        System.out.print("Kimya Notunuz : ");
        kim = input.nextInt();
        kim = kim > 0 && kim < 100 ? kim : 0;

        System.out.print("Muzik Notunuz : ");
        muz = input.nextInt();
        muz = muz > 0 && muz < 100 ? muz : 0;


        // Calculate average
        double avg = (mat + fiz + tur + tar + kim + muz) / 6;

        // Print result
        String avgResult = avg <= 55 ? "kaldınız !" : "geçtiniz !";
        System.out.println("Sonucunuz : "+ avgResult);




    }
}
