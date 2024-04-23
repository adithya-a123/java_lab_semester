import java.util.*;
class symmetric
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int a[][]=new int[10][10];
   int b[][]=new int[10][10];
   System.out.println("enter the number of rows:");
   int m=sc.nextInt();
   System.out.println("enter the number of columns:");
   int n=sc.nextInt();
   System.out.println("enter a square matrix:");
   for(int i=0;i<m;i++)
   {
    for(int j=0;j<n;j++)
    {
      a[i][j]=sc.nextInt();
     }
   }    
   System.out.println("transpose of matrix");
   for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {  
        System.out.print(a[j][i]+"\t");     
      }
      System.out.println();
   } 
      if(a[i][j]==a[j][i])
         System.out.println("symmetric");
      else
         System.out.println("not symmetric");     
  }
}   
            
