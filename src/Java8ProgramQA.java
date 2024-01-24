import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ProgramQA {
    public static void main(String[] args) {
        
        List<Student> students=Stream.of(
            new Student(20, "Naren", 37, "Male", "IT", "Hyd", 20, Arrays.asList("9573332231","814274226")),
            new Student(27, "Funny", 20, "Female", "College", "Karnataka", 30, Arrays.asList("9573332231","814274226")),
            new Student(47, "Mittu", 15, "Male", "school", "Karnataka", 40, Arrays.asList("9573332231","814274226")),
            new Student(100, "Sweety", 18, "Female", "College", "Karnataka", 10, Arrays.asList("9573332231","814274226")),
            new Student(150, "Anny", 12, "Female", "IT", "Hyd", 25, Arrays.asList("9573332231","814274226"))
        ).collect(Collectors.toList());


        List<Student> s1 = students.stream().filter(student->student.getRank()>30&&student.getRank()<50)
            .collect(Collectors.toList());

        // System.out.println(s1);   

         List<Student> s2 =students.stream().filter(student->student.getCity().equals("Hyd")
        ).sorted(Comparator.comparing(Student::getFirstName,Comparator.reverseOrder())).collect(Collectors.toList());

        //System.out.println(s2);

        Set<String> s3 = students.stream().map(Student::getDept)     
        .collect(Collectors.toSet());
        System.out.println(s3);


    }
}
