class A{
 int x=10;
 void display(){
 System.out.println("x = "+x);
 }
}
class B extends A{
 int x=5;
 
 void display(){
  super.display();
  System.out.println(x);
 }
}

class Myclass{
 public static void main(String[] args){
  B ob1 = new B();
  ob1.display();
 }
} 
