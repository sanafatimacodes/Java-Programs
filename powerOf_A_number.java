import java.util.Scanner;
public class powerOf_A_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int a=sc.nextInt();
        System.out.println("Enter the power number: ");
        int b=sc.nextInt();
        int pow=1;
        for(int i=1;i<=b;i++){
            pow*=a;
        }
        System.out.println("Power: "+pow);
        sc.close();
    }    
}
