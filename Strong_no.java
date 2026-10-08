import java.util.Scanner;
public class Strong_no{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int num=n;  
        int sum=0;
        while(n>0){
            int digit=n%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;

            }
            sum+=fact;
            n=n/10;
        }
        if(num==sum){
            System.out.println("Strong no");
        }else{
            System.out.println("Not a strong no.");
        }
        }   
    }
