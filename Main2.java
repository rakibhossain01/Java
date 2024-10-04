interface MyInterface {
    void method1();
    void method2();
}
class MyClass implements MyInterface {
    public void method1() {
        System.out.println("This is method1 implementation");
    }
    public void method2() {
        System.out.println("This is method2 implementation");
    }
}
class Main2{
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.method1();
        ob.method2();
    }
}

