class A{
  public void display(String s){
    System.out.println("Name : "+s);
}
public void display(int x){
 System.out.println("Age : "+x);
 }
}
class Main6{
  public static void main(String args[]){
    A obj = new A();
    obj.display("Raj");
    obj.display(23);
 }
}
