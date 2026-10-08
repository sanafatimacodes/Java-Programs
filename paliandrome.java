
import java.util.Scanner;

public class paliandrome {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n>0){
            int digits=n%10;
            rev=rev*10+digits;
            n=n/10;
        }
        if(rev==original){
            System.out.println("Palinadrome");
        }else{
            System.out.println("Not a palinandrome");
        }
    }
}
