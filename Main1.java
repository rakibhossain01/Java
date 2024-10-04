interface PInterface {
    void method1();
}
interface CInterface extends PInterface {
    void method2();
}
class CInterfaceImpl implements CInterface {
    @Override
    public void method1() {
        System.out.println("Method 1 from Parent Interface");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 from Child Interface");
    }
}
class Main1 {
    public static void main(String[] args) {
        CInterface ob = new CInterfaceImpl();
        ob.method1();
        ob.method2();
    }
}

