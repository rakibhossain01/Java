class People{
 String name;
 int age;
 
 People(){
 System.out.println("No Value");
 }
 People(int age,String name){
 this.age = age;
 this.name = name;
 System.out.println("age : "+age);
 System.out.println(" Name : "+name);
 }
 String Hello(String x){
  return x;
 }
}
class Test4{
 public static void main(String[] args){
  People ob = new People();
  String s = ob.Hello("Anisul");
  System.out.println("Hello Name : "+s);
  
  People ob1 = new People(25,"Abir");
  String r = ob1.Hello("Anis");
  System.out.println("Hello Name : "+r);
 }
}

