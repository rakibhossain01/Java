interface A{  
  void a();
  void b();  
  void c();  
  void d();  
}  
  
abstract class B implements A{  
  public void c(){
   System.out.println("C");
  }  
}  

class C extends B{  
  public void a(){
   System.out.println("A");
  }  
  public void b(){
   System.out.println("B");
  }  
  public void d(){
   System.out.println("D");
  }  
}  

class Main4{  
  public static void main(String args[]){  
   C ob = new C();

   ob.a();  
   ob.b();  
   ob.c();  
   ob.d();  
  }
}
