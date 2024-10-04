class SuperClass {
    protected void display() {
        System.out.println("This is a method in SuperClass.");
    }
}
class SubClass extends SuperClass {
    public void display() {
        System.out.println("This is a method in SubClass.");
    }
}
class Main7{
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.display();

        SubClass subClass = new SubClass();
        subClass.display();
    }
}

