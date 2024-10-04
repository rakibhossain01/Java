class Student {  
  public void StudentId(String name, int x){ 
    System.out.println("Name : "+name); 
    System.out.println("Roll No : "+x);
  } 
  public void StudentId(int x, String name){ 
    System.out.println("Roll No : "+x); 
    System.out.println("Name : "+name); 
  } 
} 

class Main5 { 
  public static void main(String[] args){  
    Student obj = new Student(); 
     obj.StudentId("Raj", 1); 
     obj.StudentId(2, "Abir"); 
  } 
}

