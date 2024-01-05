import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SequentialVsParllel {
    public static void main(String[] args) {
        
       
        long startNanoSec=0;
        long endNanoSec=0;
        int maxEle=900000;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<maxEle;i++){
            list.add(i);
        }
        startNanoSec=System.nanoTime();
        Stream<Integer> sequStream=list.stream();
        System.out.println(sequStream.count());
        endNanoSec=System.nanoTime();

        System.out.println("Time taken to count elements using sequential streams "+
             (endNanoSec-startNanoSec)+" nanoSeconds");

        startNanoSec=System.nanoTime();

        Stream<Integer> parlStream=list.parallelStream();

        System.out.println(parlStream.count());

        endNanoSec=System.nanoTime();

        System.out.println("Time taken to count elements using Parllel streams "+
             (endNanoSec-startNanoSec)+" nanoSeconds");
    }
}
 