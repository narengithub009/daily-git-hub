import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class DoubleStreamReduceMethodExample  {
    public static void main(String[] args) {
        
        System.out.println("Create double stream :");

        DoubleStream doubleStream=DoubleStream.of(1.1,2.1,3.1);
        System.out.println("Use reduce method to calculate sum of double stream ");

        OptionalDouble double1=doubleStream.reduce((a,b)->a+b);

        System.out.println("sum : "+double1.getAsDouble());
    }
}
