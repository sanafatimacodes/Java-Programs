import  java.util.*;
public class Sum_1toN {
    public static void main(String[]args){
        int Sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            Sum+=i;
        }
        System.out.println("Sum: "+Sum);
        sc.close();
    }
}
