class University{
 String dept;
 int numStu;
 String location;
 
 University(String dept,int numStu,String location){
  this.dept = dept;
  this.numStu = numStu;
  this.location = location;
 }
 void display(){
  System.out.println("Derartment : "+dept);
  System.out.println("Number of Student : "+numStu);
  System.out.println("Location : "+location);
 }
}
class DeptCSE extends University{
 String labName;
 
 DeptCSE(String dept,int numStu,String location,String labName){
 super(dept,numStu,location);
 this.labName = labName;
 }
 void display(){
  super.display();
  System.out.println("LabName : "+labName);
 }
}
class DeptEEE extends University{
 String project;
 
 DeptEEE(String dept,int numStu,String location,String project){
  super(dept,numStu,location);
  this.project = project;
 }
void display(){
 super.display();
 System.out.println("Project : "+project);
 }
}
class Main{
 public static void main(String[] args){
  DeptCSE cse = new DeptCSE("Computer Science", 100, "Main Campus", "Computer Lab");
  System.out.println("Details of CSE Department:");
  cse.display();
  
  DeptEEE eee = new DeptEEE("Electrical Engineering", 80, "South Campus", "Power System Project");
  System.out.println("\nDetails of EEE Department:");
  eee.display();
 }
}
