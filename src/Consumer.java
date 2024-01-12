import java.util.Scanner;

interface Consumer {
    
    public static void main(String[] args) {
        
        try(var s=new Scanner(System.in)){
            for(;;){
                var line=s.nextLine();
                System.out.println("-, "+line);
            }
        }
    }
}
