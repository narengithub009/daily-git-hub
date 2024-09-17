public class AddingNumbers {

    public static String add(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            System.out.println("Invalid inputs...");
            return "Invalid Operations";
        }
        try {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            System.out.println("Normal flow...");
            return String.valueOf(num1 + num2);q
        } catch (NumberFormatException e) {
            return "Invalid Operation : Non numaric input...";
        }

    }

    public static void main(String[] args) {
        String string = AddingNumbers.add("num", "12");
        System.out.println(string);
    }
}
