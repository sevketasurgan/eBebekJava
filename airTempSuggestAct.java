package Giris;

import java.util.Scanner;

public class airTempSuggestAct {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığı : ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak Yapabilirsiniz.");
        }else if(heat >5 && heat < 25){
            System.out.println("Sinemaya gidebilirsiniz.");
            if(heat >= 15 ){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
