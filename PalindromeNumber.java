import java.util.Scanner;  
class PalindromeNumber{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n;
   Scanner input =new Scanner(System.in);  
      n= input.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  