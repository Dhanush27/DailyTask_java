 class A {
 void calcul(int a )
 {
	 System.out.println("square root=" +(a*a));
 }
 }
 class B extends A{
	void calcul( int a )
	{
		System.out.println("square root=" + Math.sqrt(a));
	}
}
 class overridding
 {
	public static void main (String args[]) {
		A a = new A();
		a.calcul(10);
		
	}
}
