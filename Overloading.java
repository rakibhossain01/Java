class Overloading { 
   int sum(int x, int y) {
     return (x + y); 
   } 
   int sum(int x, int y, int z){ 
     return (x + y + z); 
   } 

   double sum(double x, double y){ 
     return (x + y); 
  } 
  public static void main(String args[]){ 
    Overloading s = new Overloading(); 
    System.out.println(s.sum(10, 20)); 
    System.out.println(s.sum(10, 20, 30)); 
    System.out.println(s.sum(10.5, 20.5)); 
  } 
}

