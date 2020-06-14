package Collections;

public class FinalTest {

	final int a;
	static final int b;
	
	static {b=20;}
	FinalTest()
	{
		a=400;
	}
	void display()
	{
		System.out.println("a="+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(FinalTest.b);
		FinalTest ft=new FinalTest();
		ft.display();
		//System.out.println(FinalTest.a);
	}

}
