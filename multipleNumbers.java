package Giris;

import java.util.Scanner;

public class multipleNumbers {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        n = in.nextInt();
        for(int i = 1; i < n;i++){
            if(i % 4 == 0 || i % 5 == 0)
                System.out.println(i);
        }

    }
}
