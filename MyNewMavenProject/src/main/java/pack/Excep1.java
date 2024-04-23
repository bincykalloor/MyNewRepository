package pack;

public class Excep1 {

	public static void main(String[] args) {
		int balance=2000;
		int withdraw=3000;
		if(withdraw>balance){
			//try
			//{
			//	throw new MyException();
			//}
			//catch(Exception e) {
				//System.out.println("Exception handled");
		//}
			try
			{
				throw new MyException("Insufficient balance");
			}
			catch(Exception e) {
				System.out.println("Exception handled");
			}
	}

	}
}
