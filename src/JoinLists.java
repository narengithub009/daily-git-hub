import java.util.ArrayList;
import java.util.List;

public class JoinLists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Naren");

        List<String> list2 = new ArrayList<>();
        list2.add("Neeraja");

        List<String> joinedList = new ArrayList<>();
        joinedList.addAll(list);
        joinedList.addAll(list2);

        joinedList.stream().forEach(System.out::println);
    }
}
