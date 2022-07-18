
public class MethodOverload {
	static int add(int a, int b){return a+b;}  
	static double add(double a, double b){return a+b;}  
	static class Overload {

	public static void main(String[] args) {
		System.out.println(MethodOverload.add(12.5, 105.6));
		System.out.println(MethodOverload.add(5, 6));
	}
		

	}

}


