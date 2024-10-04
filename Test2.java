class Overloading{
 String name;
 int age;
 int phone;
 
 Overloading(){
  System.out.println("No Information");
 }
 Overloading(String n,int a){
  name = n;
  age = a;
 }
 Overloading(String x,int y,int phn){
  name = x;
  age = y;
  phone = phn;
 }
 
 void display(){
  System.out.println("Name : "+name);
  System.out.println("Age : "+age);
  System.out.println("Phone : "+phone);
 }
}
class Test2{
 public static void main(String[] args){
  Overloading ob1 = new Overloading();
  ob1.display();
  
  Overloading ob = new Overloading("Anisul",30);
  ob.display();
  
  Overloading ob2 = new Overloading("Anisul Islam",31,283474848);
  ob2.display();
  
 }
}
