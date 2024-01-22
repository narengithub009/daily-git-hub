import java.util.Scanner;

public class Use_Do_While {
    public static void main(String[] args) {
        

        int n,m,rev=0,x;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        m=n;

        do{
            x=n%10;
            rev=rev*10+x;
            sum=sum+x;
            n=n/10;
        }while(n>0);

        System.out.println("reverse is :"+rev);
        System.out.println("Total sum is :"+sum);
    }
}
