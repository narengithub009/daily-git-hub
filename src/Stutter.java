public class Stutter {

    public static void main(String[] args) {

        System.out.println(stutter("enthusiastic"));
    }

    private static String stutter(String string) {
        String shutter = string.substring(0, 2);
        return shutter + "..." + " " + shutter + "..." + " " + string + "?";

    }
}
