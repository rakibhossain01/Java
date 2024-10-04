class Person{
 String name;
 int age;
 
 void display(){
  System.out.println("Name : "+name);
  System.out.println("Age : "+age);
 }
}
class Teacher extends Person{
 String qualification;
 
 void display(){
  System.out.println("Name : "+name);
  System.out.println("Age : "+age);
  System.out.println("Qualification : "+qualification);
 }
}

class M{
 public static void main(String[] args){
  Teacher ob = new Teacher();
  ob.name = "Anisul";
  ob.age = 30;
  ob.qualification = "M.Sc";
  ob.display();
 }
}
