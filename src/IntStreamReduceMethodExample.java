import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamReduceMethodExample  {
    public static void main(String[] args) {
        
        System.out.println("Create IntStream :");

        IntStream intStream=IntStream.of(1,2,3,4);

        OptionalInt int1=intStream.reduce((n1,n2)-> n1+n2);
        System.out.println("sum with IntStream reduce () : "+int1.getAsInt());
   }   
}   
