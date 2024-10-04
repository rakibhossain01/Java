class Parent {
    public final void display() {
        System.out.println("This is a final method in Parent class");
    }
    public static void show() {
        System.out.println("This is a static method in Parent class");
    }
}
class Child extends Parent {
    public static void show() {
        System.out.println("This is a static method in Child class");
    }
}
class Main8 {

    public static void main(String[] args) {

        Child child = new Child();
        child.display();
        Parent.show();
        child.show();

    }
}

