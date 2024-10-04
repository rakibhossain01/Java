public class Overloading1 { 
  public static void main(String[] args){ 
    System.out.println("Hello World"); 
    Overloading1.main("World"); 
    Overloading1.main();
  } 
 
   public static void main(String s){ 
     System.out.println(s); 
   } 

   public static void main(){ 
      System.out.println("Hello"); 
   } 
}

