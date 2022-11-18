package Giris;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        // Initialize variables
        int first, sec, third;
        Scanner input = new Scanner(System.in);

        //get inputs from user
        System.out.print("1. Sayıyı Giriniz : ");
        first = input.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        sec = input.nextInt();

        System.out.print("3. Sayıyı Giriniz : ");
        third = input.nextInt();

        // Selection sort algorithm
        int[] numArr = {first,sec,third};
        int tmp, min;
        for(int i = 0; i<2;i++){
            min = i;
            for(int j = i; j<2; j++){
                if(numArr[j] < numArr[min]){
                    min = j;
                }
            }
            tmp = numArr[i];
            numArr[i] = numArr[min];
            numArr[min] = tmp;
        }
        //Printing results
        for (int i = 1; i<=3 ; i++){
            System.out.println( i + ". Sayı : "+ numArr[i-1]);
        }

    }
}
