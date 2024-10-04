class Teacher{
 String name;
 int age;
 
 void setInfo(String n,int a){
  name = n;
  age = a;
 }
 void display(){
  System.out.println("Name : "+name);
  System.out.println("Age : "+age);
 }
}

class Test{
 public static void main(String[] args){
  Teacher ob = new Teacher();
  ob.setInfo("Anis",30);
  ob.display();
  
  Teacher ob1 = new Teacher();
  ob1.setInfo("Anisul",31);
  ob1.display();
 }
}
