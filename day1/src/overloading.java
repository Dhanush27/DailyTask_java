public class overloading {

public void display(int a, int b)
 {
	   System.out.println(a+b);
	   
 }

   public void display( double a, double b){
	   double d;
	  d = a+b;
	   System.out.println(d=a+b);
	   
   }
public static void main(String []args)
{
	overloading  d = new overloading();
	d.display(10,90);
	d.display(10.0, 0.1);
}
}