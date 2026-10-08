
import java.util.Scanner;

public class first_and_last_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int last_digit=n%10;
        while(n>9){
            n=n/10;
        }
        int first_digit=n;
        System.out.println("First Digit: "+first_digit);
        System.out.println("Last Digit; "+last_digit);
        sc.close();
    }
}
