import java.util.Scanner;
public class Count_divisibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Enter a number: ");
        int k=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(i%k==0){
                count++;
            }
        }
        System.err.println("Count: "+count);
        sc.close();
    }
}
