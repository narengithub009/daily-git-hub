package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceComparator {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(11, "Narender", "Hyderabad"));
        list.add(new Student(12, "Aswitha", "Medipally"));
        list.add(new Student(13, "Neeraja", "Canaranagar"));

        for (Student student : list) {
            System.out.println(student);
        }

        Collections.sort(list, new SortByName());

        for (Student student : list) {
            System.out.println(student);
        }
    }

}

class Student {
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
    }

}

class SortByRoll implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollno - o2.rollno;
    }

}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }

}
