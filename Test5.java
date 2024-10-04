class Person{
 String name;
 int age;
 
 void display1(){
  System.out.println("Name : "+name);
  System.out.println("Age : "+age);
 }
}
class Teacher extends Person{
 String gender;
 
 void display(){
  display1();
  System.out.println("Gender : "+gender);
 }
}
class Man extends Person{
 int phone;
 
 void display(){
  display1();
  System.out.println("Phone : "+phone);
 }
}

class Test5{
 public static void main(String[] args){
  Teacher ob = new Teacher();
  ob.name = "Anis";
  ob.age = 30;
  ob.gender = "Male";
  //ob.phone = 367475478;
  ob.display();
  
  Man ob2 = new Man();
  ob2.name = "Anisul Islam";
  ob2.age = 40;
  ob2.phone = 37474574;
  ob2.display();
 }
}
