class A{
 A(){
  System.out.println("Constractor A");
 }
}
class B extends A{
 B(){
  super();
  System.out.println("Constractor B");
 }
}
class SuperConstractor{
 public static void main(String[] args){
  B ob = new B();
 }
}
