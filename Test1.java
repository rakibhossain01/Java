class Constractor{
 String name;
 int age;
 
 Constractor(){
  System.out.println("No Value");
 }
 Constractor(String n,int a){
  name = n;
  age = a;
 }
 void Display(){
  System.out.println("Name : "+name);
  System.out.println("Age : "+age);
 }
}

class Test1{
 public static void main(String[] args){
 
  Constractor ob1 = new Constractor();
  ob1.Display();
  
  Constractor ob = new Constractor("Anisul",30);
  ob.Display();
 }
}

