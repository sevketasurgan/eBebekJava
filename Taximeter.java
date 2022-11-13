package Giris;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        double km, tutar,acilisUcret = 10.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Km bilgisi giriniz : ");
        km = input.nextDouble();

        tutar = (km * 2.20) + acilisUcret;
        if(tutar < 20){
            System.out.println("Tutarınız 20 Liranın altında kalmaktadır standart tarife uygulanacaktır..");
            tutar = 20 + acilisUcret;
        }
        System.out.println("Ödenecek Tutar : " + tutar);


    }
}
