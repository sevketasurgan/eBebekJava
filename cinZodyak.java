package Giris;

import java.util.Scanner;

public class cinZodyak {
    public static void main(String[] args) {
        int birthDate, zodyak;
        String result;

        Scanner in = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz :  ");
        birthDate = in.nextInt();

        zodyak = birthDate % 12;
        switch (zodyak){
            case 0:
                result = "Maymun";
                break;
            case 1:
                result = "Horoz";
                break;
            case 2:
                result = "Köpke";
                break;
            case 3:
                result = "Domuz";
                break;
            case 4:
                result = "Fare";
                break;
            case 5:
                result = "Öküz";
                break;
            case 6:
                result = "Kaplan";
                break;
            case 7:
                result = "Tavşan";
                break;
            case 8:
                result = "Ejderha";
                break;
            case 9:
                result = "Yilann";
                break;
            case 10:
                result = "At";
                break;
            case 11:
                result = "Koyun";
                break;
            default:
                result = " Hata";
                break;
        }
        if(birthDate > 0){
            System.out.print("Çin Zodyağı Burcunuz : " + result);
        }else{
            System.out.print("Hata!");
        }

    }
}
