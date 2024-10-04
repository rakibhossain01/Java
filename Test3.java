class CopyConstractor{
 String name;
 int id;
 int age;
 
 CopyConstractor(String n,int i,int a){
  name = n;
  id = i;
  age = a;
 }
 
 CopyConstractor(CopyConstractor a){
  name = a.name;
  id = a.id;
  age = a.age;
 }
 void display(){
  System.out.println("Name : "+name);
  System.out.println("ID : "+id);
  System.out.println("Age : "+age);
 }
}
class Test3{
 public static void main(String[] args){
  CopyConstractor ob = new CopyConstractor("Anisul",76,30);
  ob.display();
  CopyConstractor ob1 = new CopyConstractor(ob);
  ob1.display(); 
 }
}
