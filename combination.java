package Giris;

import java.util.Scanner;

public class combination {
    // adding factorial function
    public static int factorial(int n){
        int result= 1;
        for(int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }
    //calculating combination with factorial function
    public static int calcCombination(int a, int b){
        int result = factorial(a) / (factorial(b)* factorial(a-b));
        return result;
    }
    public static void main(String[] args) {
        //Initialize variables.
        int a,b;

        Scanner in = new Scanner(System.in);
        // get inputs from user
        System.out.print("İlk Sayıyı Giriniz : ");
        a = in.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        b = in.nextInt();
        // Print result.
        System.out.print("Girdiğiniz sayıların kombinasyonu : " + calcCombination(a,b));
    }
}
