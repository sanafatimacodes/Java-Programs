
import java.util.Scanner;

public class Largest_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();int largest=-1;
        while(n>0){
            int digit=n%10;
            if(largest<digit){
                largest=digit;
            }
            n=n/10;
    }
    System.out.println("Largest: "+largest);
    sc.close();
}}
