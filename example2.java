package rahul;

public class example2 {
	public static void main(String[] args) {
		try {
			System.out.println("A");
			int x=10/0;
			System.out.println("B");
		}
		finally
		{
			System.out.println("C");
		}
		System.out.println("P");
	}

}
