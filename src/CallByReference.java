
public class CallByReference {
	int b =150;
	
	static void change(CallByReference cr)
	{
		cr.b = cr.b+20;
	}
	public static void main(String[] args) {
		CallByReference cr = new CallByReference();
		System.out.println("Before change " + cr.b);
		CallByReference.change(cr);
		System.out.println("after change "+ cr.b);

	}

}

