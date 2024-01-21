import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        int s1,s2 , flag=0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter starting number : ");
            s1=scanner.nextInt();
            System.out.println("Enter ending number : ");
            s2=scanner.nextInt();
        }

        for(int i=s1;i<=s2;i++){

            for(int j=2;j<i;j++){

                if(i%j==0){

                    flag=0;
                    break;
                }else{
                    flag=1;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }
    }
}
