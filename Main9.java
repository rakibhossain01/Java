class Animal {
    String color = "white";

    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    String color = "black";

    void eat() {
        System.out.println("Eating bread");
    }

    void displayColor(){
        System.out.println("Dog color is: " + this.color);
        System.out.println("Animal color is: " + super.color);
    }

    void displayEating(){
        this.eat();
        super.eat();
    }
}
class Main9 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayColor();
        d.displayEating();
    }
}

