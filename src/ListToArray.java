import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("How");
        list.add("Are");
        list.add("You");

        String[] arr=new String[list.size()];
        list.toArray(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
