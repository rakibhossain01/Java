class V{
 String color;
 double w;
 
 V(String color,double w){
  this.color = color;
  this.w = w;
 } 
 void atribute(){
  System.out.println("Coler : "+color);
  System.out.println("Weight : "+w);
 }
}

class Car extends V{
 int gair;
 Car(String c,double w,int g){
  super(c,w);
  gair = g;
 }
 void atribute(){
  super.atribute();
  System.out.println("Gair : "+gair);
 }
}
class CFG{
 public static void main(String[] args){
  Car ob = new Car("Red",340,5);
  ob.atribute();
 }
}
