package Giris;

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
       int mat,fiz,kim,tar,tur,muz;
       double finalScore;
       boolean result;

       Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat=input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fiz=input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kim=input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tar=input.nextInt();

        System.out.print("Turkce Notunuz : ");
        tur=input.nextInt();

        System.out.print("Muzik Notunuz : ");
        muz=input.nextInt();

        finalScore = (mat+fiz+kim+tar+tur+muz) / 6.0;

        System.out.println("Ortalamanız : " + finalScore);
        String res = (finalScore > 60)  ? "Geçtiniz ! :)" : "Kaldınız :(";
        System.out.print(res);

    }
}
