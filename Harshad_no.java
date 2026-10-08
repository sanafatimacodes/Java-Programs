
import java.util.Scanner;

public class Harshad_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(n>0){
            int digits=n%10;
             sum+=digits;
            n=n/10;

        }
        if(num%sum==0){
            System.out.println("Harshad no ");
        }else{
            System.out.println("Not a harshad no.");
        }
    }
}
