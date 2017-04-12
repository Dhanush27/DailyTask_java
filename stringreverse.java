package sample;

public class stringreverse {

	public static void main(String[] args) {
	
    String str="local_ios";
    String a="";
    String b="";
    for(int i=str.length()-1;i>4;i--)
    {
    	a+=str.charAt(i);
    }
    for(int i=str.length()-9;i<5;i++){
    	b+=str.charAt(i);
    }
    System.out.println(a+b);
	}

}
