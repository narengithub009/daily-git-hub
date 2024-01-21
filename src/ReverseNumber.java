import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number :");
        Integer number=scanner.nextInt();
        String[] s=number.toString().split("");
        String[] num=new String[s.length];
        int count=0;
        for(int i=s.length-1;i>=0;i--){
            num[count]=s[i];
            count++;
        }
        for (String i : num) {
            System.out.print(i);
        }
        if(s.equals(num)){
            System.out.println("it's palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }
}
