import java.util.Scanner;

public class exponential {

    // defining a function which as calculate exponential
    public static int exp(int a, int b){
        int result = a;
        for(int i = 1; i < b; i++){
            result = result * a;
        }

        return result;
    }

    public static void main(String[] args) {
        // Initialize variables
        int a,b;
        Scanner in = new Scanner(System.in);
        //get inputs from user
        System.out.print("Lütfen ilk sayıyı giriniz : ");
        a = in.nextInt() ;

        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        b = in.nextInt() ;
    // Print result
        System.out.print(a + " üzeri "+ b + " = " + exp(a,b));
    }
}
