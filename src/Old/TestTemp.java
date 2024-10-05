package Old;

public class TestTemp {

    String balacedStr = "{(ss[ss])}";

    public static void verifyString(String unBalacedStr) {

        String[] split = balacedStr.split("");
        String[] split2 = unBalacedStr.split("");

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(split2[i])) {
                System.out.println("The given string not matching");
            } else {
                System.out.println("given string is matching");
            }
        }

    }

    public static void main(String[] args) {
        TestTemp.verifyString("{(ss[ss]");
    }
}
