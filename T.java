class A{
 int a;
 int b;
 
 void display(){
  System.out.println(a*b);
 }
}
class B extends A{
 
 void display(){
  System.out.println(a*b);
 }
}

class T{
 public static void main(String[] args){
  B ob = new B();
  ob.a = 5;
  ob.b = 6;
  ob.display();
 }
}
