import java.beans.Transient;

public class ShuffletheName {

    public static void main(String[] args) {

        System.out.println(shuffletheName("Rosie O'Donnell"));
    }

    private static String shuffletheName(String string) {
        String suffleString;
        String[] split = string.split(" ");
        suffleString = split[1] + " " + split[0];
        return suffleString;

    }

    public void test1() {

    }
}
