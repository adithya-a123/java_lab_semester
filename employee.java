import java.util.*;
class employee
{
  int eNo;
  String eName;
  int eSalary;
  employee(int eNo,String eName,int eSalary)
  {
    this.eNo=eNo;
    this.eName=eName;
    this.eSalary=eSalary;
   }
}
class array_objects
{
  public static void main(String args[])
  {
     int i,flag=0;
     Scanner sc=new Scanner(System.in);
     Scanner s=new Scanner(System.in);
     System.out.println("enter the size :");
     int n=sc.nextInt();
     employee[] obj=new employee[n];  
     for(i=0;i<n;i++)
     {
       System.out.println("enter the details of employee"+(i+1));
       System.out.println("Employee number:");
       int eNo=sc.nextInt();
       System.out.println("Employee Name: ");
       String eName=s.nextLine();
       System.out.println("salary:");
       int eSalary=sc.nextInt();
       obj[i]=new employee(eNo,eName,eSalary);
      }
      System.out.println("enter the employee number to search:");
      int no=sc.nextInt();
      for(i=0;i<n;i++)
      {
        if(obj[i].eNo==no)
        {
        System.out.println("Employee name:"+obj[i].eName);
        }
      }
    }
 }

         
         
      
	
