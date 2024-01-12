public class MethodOverloadingEx {

    static int add(int a,int b){
        return a+b;
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(MethodOverloadingEx.add(12, 12));
        System.out.println(MethodOverloadingEx.add(12, 12, 12));
    }
}
