package Old;

public class InterfaceImpl implements InterfaceDemo, InterfaceDemo1 {

    @Override
    public void printName() {
        InterfaceDemo.super.printName();
    }

}
