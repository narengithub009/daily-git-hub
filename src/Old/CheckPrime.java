import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        
        int num=20,flag=0;

        for(int i=2;i<num;i++){
            if(i%num==0){
                flag=0;
                break;
            }else{
                flag=1;
            }

            
        }
        if (flag==1) {
            System.out.println("The given number is Prime number ");
        }else{
            System.out.println("The given number is not Prime number ");
        }
    }
}
