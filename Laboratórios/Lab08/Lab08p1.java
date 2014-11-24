package sessão09_10;

public class Lab08p1 {

	public static void main(String[] args) 
	{
		methodA(3,4,9,7);
	}
		
	public static void methodA(int a, int b, int c, int d) 
	{
		System.out.println(methodB(a,c) + methodC(b,d));    //12 + 11 = 23
	}
	
	public static int methodC(int i, int j) 
	{
		methodD(i + "+" + j);             // print 4 + 7     => return to MethodA 11
		return i + j;
	}
		
	public static int methodB(int i, int j) 
	{
		return methodC(i, j);          // print 3 + 9     => return to MethodA 12
	}
		
	public static void methodD(String string) 
	{
		System.out.println(string);    
	}
}
