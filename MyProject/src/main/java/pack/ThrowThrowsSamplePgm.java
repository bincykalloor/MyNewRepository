package pack;

public class ThrowThrowsSamplePgm {
	
	public void print01() {
		try
		{
			print02();
		}
		catch(ArithmeticException e) {
			System.out.println("Expetion handled");
		}
	}
	public void print02()throws ArithmeticException {
		print03();
	}
	
	public void print03() throws ArithmeticException {
		int v=100/0;
		System.out.println(v);
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		ThrowThrowsSamplePgm c=new ThrowThrowsSamplePgm();
		c.print01();
	}

}
