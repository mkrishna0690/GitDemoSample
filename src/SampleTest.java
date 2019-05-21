
public class SampleTest {

	public static void main(String[] args) {

	
		int a = 1;
		int b = 2;
		
		System.out.println("Before");
		System.out.println("A:="+a);
		System.out.println("B:="+b);
		
		a = a + b;
		b = a - b;
		a = a + b;

		System.out.println("After");
		System.out.println("A:="+a);
		System.out.println("B:="+b);
	
	}

}
