package mypack2;
import Arithmetic.*;
import java.util.*;
class Arithmetic_operations
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Operations obj=new Operations();
    System.out.println("Enter first number:");
    int a=sc.nextInt();
    System.out.println("Enter the second number:");
    int b=sc.nextInt();
    System.out.println("Sum is:"+obj.addition(a,b));
    System.out.println("Difference is:"+obj.diff(a,b));
    System.out.println("Product is:"+obj.multi(a,b));
    System.out.println("Quotient is:"+obj.division(a,b));
  }
}    
