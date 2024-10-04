import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Producer {
    public static void main(String[] args) {
        
        Consumer<String> slowPrinter=input->{
            try{
                TimeUnit.SECONDS.sleep(1);

            }catch(InterruptedException e){

            }
            System.out.println(input);
        };

        Stream.generate(System::nanoTime).map(String::valueOf).forEach(slowPrinter);
    }
}
