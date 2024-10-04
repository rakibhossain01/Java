import java.util.Scanner;

public class VowelConsonant{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  //char ch = input.next().charAt(0);
  
  /*if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
   System.out.println("Vowel = "+ch);
  }
  else{
   System.out.println("Consonant = "+ch);
  }*/
  
  int n = input.nextInt();
  
  if(n<=3){
  System.out.println("Prime number");
  }
  else if(n>3){
   for(int i=2;i<=n/2;i++){
    if(n%i==0){
     System.out.println("Not Prime");
    }
   }
 }
 else{
 System.out.println("Prime");
 }
 }
}
