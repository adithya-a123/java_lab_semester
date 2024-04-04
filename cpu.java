class Cpu{
  int price;
  Cpu(int price){
   this.price=price;
  }
  class processor{
    int core;
    String manufacturer;
    processor(int core,String manufacturer)
    {
      this.core=core;
      this.manufacturer=manufacturer;
    }
    void display(){
    System.out.println("core:"+core +" manufacturer:"+ manufacturer);
    }
  }
  class ram{
    String memory;
    String manf;
    ram(String memory,String manf)
    {
      this.memory=memory;
      this.manf=manf;
    }
    void display()
    {
      System.out.println("memory:"+memory +"  manufacturer:"+manf);
    }
   }        
  void display(){
   System.out.println("price is:"+price);
   }
public static void main(String args[]){
     Cpu sc=new Cpu(12000);
     Cpu.processor p1=sc.new processor(4,"asus");
     Cpu.ram r1=sc.new ram("16GB","intel");
     sc.display();
     p1.display();
     r1.display();
    }
 }   

	
