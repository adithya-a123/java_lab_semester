import java.util.*;
class  sort{
    public static void main(String args[])
    {
      int i;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array:");
      int n=sc.nextInt();
      String[] arr=new String[n];
      System.out.println("enter the elements of array:");
      for(i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextLine();
      }
      System.out.println("array elements are:");
      for(i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
      System.out.println("array elements after sorting:");
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
    }
 }    

     
	
