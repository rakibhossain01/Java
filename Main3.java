interface MyInterface {
    static void Method1() {
        System.out.println("This is a static method ");
    }
    default void Method2() {
        System.out.println("This is a default method");
    }
}
class Main3 implements MyInterface {
    public static void main(String[] args) {
    
        MyInterface.Method1();
        
        Main3 ob = new Main3();
        ob.Method2();
    }
}

