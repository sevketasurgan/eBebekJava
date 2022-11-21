package Giris;

import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        // Initialize variables.
        int n;
        double result = 0.0;
        Scanner in = new Scanner(System.in);
        //get inputs from user
        System.out.print("Lütfen bir sayı giriniz : ");
        n = in.nextInt();
        for(int i = 1; i <= n; i++){
            result += (1.0/i);
        }
        // print result
        System.out.print(result);
    }
}
