
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        
        Set<String>  set=new HashSet<>();

        set.add("Hello");

        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()) {
          //  set.add("Howru");
            System.out.println(iterator.next());
        }

        Enumeration<String> enumeration=Collections.enumeration(set);
        while (enumeration.hasMoreElements()) {
            set.add(null);
            System.out.println(enumeration.nextElement());
        }
    }
}
