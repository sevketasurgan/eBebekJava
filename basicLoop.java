package Giris;

import java.util.Scanner;

public class basicLoop {
    public static void main(String[] args) {
        int inputNumber, total = 0, avg;
        //get inputs from user
        Scanner in = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        inputNumber = in.nextInt();
        // for loop for detecting numbers and sum it
        for(int i = 0;i <= inputNumber; i++){
            if(i % 3 == 0 || i % 4 == 0)
                total += i;
        }

        // average of total numbers
        avg = total / inputNumber;

        System.out.print("Ortalama : " + avg);
    }
}
