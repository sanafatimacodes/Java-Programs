
import java.util.Scanner;

public class Automorphic_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=sc.nextInt();
        int original=n;
        int count=0;
        int squared=n*n;
        while(n>0){
            int digit=n%10;
            count++;
            n=n/10;
        }
        int num=1;
        for(int i=1;i<=count;i++){
            num=num*10;
        }
        if(squared%num==original){
            System.out.println("Automorphic no. ");
        }else{
            System.out.println("Not a Automorphic no.");
        }
    }
}
