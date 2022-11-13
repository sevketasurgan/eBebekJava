package Giris;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {


        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00,kilo, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo : ");
        kilo = input.nextDouble();
        armut *= kilo;

        System.out.print("Elma Kaç Kilo : ");
        kilo = input.nextDouble();
        elma *= kilo;

        System.out.print("Domates Kaç Kilo : ");
        kilo = input.nextDouble();
        domates *= kilo;

        System.out.print("Muz Kaç Kilo : ");
        kilo = input.nextDouble();
        muz *= kilo;

        System.out.print("Patlıcan Kaç Kilo : ");
        kilo = input.nextDouble();
        patlican *= kilo;

        toplam = armut + elma + domates + muz + patlican;

        System.out.print("Toplam Tutar : " + toplam);


    }
}
