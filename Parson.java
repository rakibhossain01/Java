class Parson{
 String name;
 int age;
 int phone;
 
 Parson(String name,int age){
  this.name = name;
  this.age = age;
 }
 Parson(String name,int age,int phone){
  this(name,age);
  this.phone = phone;
 }
 
 void display(){
  System.out.println("Name : = "+name);
  System.out.println("Age : = "+age);
  System.out.println("Phone : "+phone);
 }
}
class This{
 public static void main(String[] args){
  Parson ob1 = new Parson("Ra",23);
  ob1.display();
  
  Parson ob2 = new Parson("Rak",24,9007);
  ob2.display();
 }
}
