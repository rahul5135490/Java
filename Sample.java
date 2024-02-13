package rahul;

public class Sample extends example22{
Sample()
{
	this(20);
	System.out.println("P");
}
Sample(int a)
{
	this("PQR");
	System.out.println("Q");
}
Sample(String s)
{
	System.out.println("R");
}
	

	public static void main(String[] args) {
		Sample s =new Sample();
		Sample s1 =new Sample(10);
		Sample s2 =new Sample("cdf");

	}

}
