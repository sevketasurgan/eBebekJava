package Giris;

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        double kilo, height;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        System.out.print("Lütfen Boyunuzu Giriniz : ");
        height = input.nextDouble();

        System.out.println("Vücut Kitle Endeksiniz : " + BMI(height,kilo));

    }
    static double BMI(double height, double kilo){
        return kilo/(height*height);
    }
}
