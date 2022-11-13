package Giris;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        double firstNum, secNum;

        // choose an operator
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi işlemi yapmak istiyorsunuz (*,/,+,-) :");
        operator = input.next().charAt(0);

        // Get input numbers from users
        System.out.print("İlk sayıyı giriniz : ");
        firstNum = input.nextDouble();

        System.out.print("İkinci Sayıyı giriniz : ");
        secNum = input.nextDouble();

        // Calculator function
        Calculate(operator,firstNum,secNum);

    }

    static void Calculate(char operator, double firstNum, double secNum){
        // Doing calculations for operator
        double result = 0;
        switch (operator){
            case '+':
                result = firstNum + secNum;
                System.out.println(firstNum + " + " + secNum + " = " + result);
                break;
            case '-':
                result = firstNum - secNum;
                System.out.println(firstNum + " - " + secNum + " = " + result);
                break;
            case '*':
                result = firstNum * secNum;
                System.out.println(firstNum + " * " + secNum + " = " + result);
                break;
            case '/':
                result = firstNum / secNum;
                System.out.println(firstNum + " / " + secNum + " = " + result);
                break;
            default:
                System.out.println("Lütfen Geçerli Değerler Giriniz !!");
                break;
        }

    }
}
