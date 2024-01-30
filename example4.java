package rahul;

public class example4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}
		static int m1()
		{
			try {
				System.out.println("A");
				return 10;
			}
			catch(ArithmeticException e)
			{
				System.out.println("B");
				return 20;
			}
			finally
			{
				System.out.println("C");
				return 30;
			}
		}
}
