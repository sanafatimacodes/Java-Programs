
import java.util.Scanner;

public class Product_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter a number");
        int n=sc.nextInt();
        int prod=1;
        while(n>0){
            int digit=n%10;
            prod*=digit;
            n=n/10;
        }
        System.out.println("Product: "+prod);
        sc.close();
    }
}
