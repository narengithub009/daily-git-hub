import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListVsHashset {
    public static void main(String[] args) {
        
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("How are you");
        list.add(null);
        list.add("Hello");

        list.stream().forEach(System.out::println);
        System.out.println("*************************");
        Set<String> set=new HashSet<>();

        set.add("Set Hello");
        set.add("Naren");
        set.add(null);
        set.add("Set Hello");

        set.stream().forEach(System.out::println);
    }
}
