import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraySet {
    public static void main(String[] args) {
        
        String[] str={"Hello","how","you",null,null};
        //Set<String> set=new HashSet<>(Arrays.asList(str));
        Set<String> set=new HashSet<>(Arrays.stream(str).collect(Collectors.toSet()));
        
        System.out.println(set);
    }
}
