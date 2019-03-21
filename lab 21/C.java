public class C extends B{
  private int x;
  private String a;
  public C(int x, String a, String s){
     super(s);
    this.x=x;
    this.a=a;
    
   
    s="Five";
  }
  System.out.println (x);
    System.out.println("c"+a);
     System.out.println("c"+super.s);
      System.out.println(getS());
       System.out.println("c"+s);
       
}