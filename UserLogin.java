package Giris;

import java.util.Scanner;



public class UserLogin {
    public static void main(String[] args) {
        // Initialize variables
        String usernameDB = "sevket", passwordDB = "12345";
        String username,password,recPass;
        int recover ;
        boolean state = true;



        // while loop created to log in user again
        while(state){
            // User inputs for login process
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı adınızı giriniz : ");
            username = input.nextLine();

            System.out.print("Şifrenizi giriniz : ");
            password = input.nextLine();
            if(username.equals(usernameDB) && password.equals(passwordDB)){
                System.out.println("Hoşgeldin !");
                state = false;
            }else{
                // if username true but password is not, therefore recover the password
                if (username.equals(usernameDB)){
                    System.out.print("Şifrenizi yanlış girdiniz. Sıfırlamak için 1'e basınız : ");
                    recover = input.nextInt();
                    if (recover == 1){
                            System.out.print("Yeni şifrenizi giriniz :");
                            Scanner sc = new Scanner(System.in);
                            String newPass =  sc.nextLine();
                            passwordDB = newPass;

                        System.out.println("Şifreniz başarı ile değiştirildi. Giriş Sayfasına Yönlendiriliyorsunuz !!");
                    }
                }else{
                    // if inputs are incorrect, ask again.
                    System.out.println("Kullanıcı adı veya şifrenizi hatalı girdiniz ! ");
                }


            }
        }




    }
}
