class A{
 void display(){
  System.out.println("A");
 }
}
class B extends A{
 @override
 void display(){
  super.display();
  System.out.println("B");
 }
}
class SupperOverrideMethod{
 public static void main(String[] args){
  B ob1 = new B();
  ob1.display();
 }
}
