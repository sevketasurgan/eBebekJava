package Giris;

import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {

        double tutar, kdvOran = 1.8, kdvTutar, kdvliFiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        tutar = input.nextDouble();
        boolean res = tutar > 0 && tutar < 1000 ? true : false;
        if(res){
            kdvliFiyat = tutar * 1.18;
        kdvTutar = Math.abs(kdvliFiyat-tutar);
         
        System.out.println("Kdv'siz fiyat : " + tutar);
        System.out.println("Kdv'li fiyat : " + kdvliFiyat);
        System.out.println("Kdv eklenen fiyat : " + kdvTutar);
        System.out.println("Kdv Oranı  : " + kdvOran);
            
        }else{
            System.out.println("Lütfen 0 ile 1000 tl arasında tutar giriniz ! ");
        }
        
        


    }
}
