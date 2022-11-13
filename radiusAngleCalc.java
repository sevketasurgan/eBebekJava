package Giris;

import java.util.Scanner;

public class radiusAngleCalc {
    public static void main(String[] args) {
        double rad, centerAngle,result;

        Scanner input = new Scanner(System.in);

        System.out.print("Çemberin Yarıçapını Giriniz : ");
        rad = input.nextDouble();

        System.out.print("Merkez açısını giriniz : ");
        centerAngle = input.nextDouble();

        result = calcRadius(rad,centerAngle);
        System.out.println("Alan : " + result);


    }
    static double calcRadius(double r,double a) {
        return (Math.PI * (r*r) * a) / 360;
    }
}
