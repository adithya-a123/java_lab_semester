import java.util.*;
class pdt{
          String pcode;
          String pname;
          int price;
          pdt(String pcode,String pname,int price)
          {
            this.pcode=pcode;
            this.pname=pname;
            this.price=price;
          }
         void display()
         {
           System.out.println(pcode+" "+pname+" "+price);  
         }
     }    
class Product
{
  public static void main(String args[])
  {
    pdt p1=new pdt("p01","airconditioner",10000);
    p1.display();
    pdt p2=new pdt("p02","refrigrator",20000);
    p2.display();
    pdt p3=new pdt("p03","television",15000);
    p3.display();
    if(p1.price<p2.price && p1.price<p3.price)
    {
     System.out.println("lowest price is:"+p1.price);
    }
    else if(p2.price<p3.price && p2.price<p1.price)
    {
     System.out.println("lowest price is:"+p2.price);
    }
    else
    {
     System.out.println("lowest price is:"+p3.price);
    }  
  }            
}
	
