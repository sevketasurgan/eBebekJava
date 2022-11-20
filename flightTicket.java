package Giris;

import java.util.Scanner;

public class flightTicket {

    // calcTicket function gets three parameter which are distance, age discount ratio , flight Type. This function
    // calculates ticket price and return ticket price
    static double calcTicket(int dist, double ageDiscountPct, int flightType) {
        double resultPrice;
        double normalPrice = dist * 0.10;
        double discountPrice = normalPrice - (normalPrice * ageDiscountPct);

       switch (flightType){
           case 1:
               resultPrice = discountPrice;
               break;
           case 2:
               resultPrice = (discountPrice - (discountPrice* 0.20)) * 2;
               break;
           default:
               resultPrice = -1;
       }
        return resultPrice;
    }
    // ageDiscountPct function get 1 parameter which is age. This function returns discount ratio by age.
    static double ageDiscountPct(int age){
        double percentage;
        if(age < 12)
            percentage = 0.50;
        else if(age >= 12 && age < 24)
            percentage = 0.10;
        else if(age > 65)
            percentage = 0.30;
        else
            percentage = -1;
        return percentage;
    }



    public static void main(String[] args) {
        int dist, age, flightType;
        Scanner in = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        dist = in.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = in.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        flightType = in.nextInt();

        if(dist > 0 && age > 0 && (flightType == 1 ||flightType == 2)){

            System.out.print("Toplam ödenecek tutar : " + calcTicket(dist,ageDiscountPct(age), flightType) + " TL");
        }else{
            System.out.print("Hatalı giriş yaptınız!");
        }




    }


}
