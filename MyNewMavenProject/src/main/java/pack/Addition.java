package pack;

public class Addition {

	public static void main(String[] args) {
		try
		{
			int v=100/0;//infinity
			System.out.println(v);
		}
		catch (Exception e) {
			System.out.println("Exception Handled"+e);
		}
		finally {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
		System.out.println("rest of the statement");

	}
}
