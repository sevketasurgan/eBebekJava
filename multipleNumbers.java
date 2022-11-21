package Giris;

import java.util.Scanner;

public class multipleNumbers {
    public static void main(String[] args) {
        // Initialize variables.
        int n;
        Scanner in = new Scanner(System.in);
        // get inputs from user
        System.out.print("Lütfen bir sayı giriniz : ");
        n = in.nextInt();
        // calculate numbers divisible by 4 and 5
        for(int i = 1; i < n;i++){
            if(i % 4 == 0 || i % 5 == 0)
                System.out.println(i);
        }

    }
}
