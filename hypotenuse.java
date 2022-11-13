package Giris;

import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {

        double adjacent, opposite, hypotenuse;
        Scanner input = new Scanner(System.in);
        System.out.print("Komşu kenarı girin : ");
        adjacent = input.nextDouble();

        System.out.print("Karşı kenarı girin : ");
        opposite = input.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(adjacent,2.0) + Math.pow(opposite,2.0));

        System.out.println("Hipotenüs : " + hypotenuse);

    }
}
