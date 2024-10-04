class A{
 String name;
 
 A(String name){
  this.name = name;
 }
 A(){
  System.out.println("Name : "+name);
 }
}
class B extends A{
 int age;
 B(String name,int age){
 super(name);
 this.age = age;
 }
 B(){
  super.A();
  System.out.println("Age : "+age);
 }
}
class CFG{
 public static void main(String[] args){
  B ob1 = new B("R");
  ob1.B();
  B ob2 = new B("Ra",24);
  ob2.B();
 }
}
