
import java.util.Scanner;

public class Count_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int odd_count=0,even_count=0;
        while(n>0){
            int digits=n%10;
            if(digits%2==0){
                even_count++;
            }else{
                odd_count++;
            }
            n=n/10;
        }
        System.out.println("Even: "+even_count);
        System.out.println("Odd: "+odd_count);
    }
}
