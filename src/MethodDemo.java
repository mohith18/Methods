
public class MethodDemo {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		MethodDemo ob=new MethodDemo();
		int c= ob.add(18,13);
		System.out.println("addition of a and b  is :" + c);
		}
}