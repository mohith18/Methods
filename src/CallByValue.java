
public class CallByValue {
	int a = 100;
	
	void change(int a) {
		a=a+10;
	}

	public static void main(String[] args) {
		CallByValue cv = new CallByValue();
		System.out.println("before change " + cv.a);
		cv.change(50);
		System.out.println("after change "+ cv.a);

	}

}

