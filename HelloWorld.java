import java.lang.*;

class test {
	private int val;
	
	public test(int v)
	{
		val = v;
	}
	
	public void method(test obj) {
		this.val = obj.val;
	}
	
	public int getVal()
	{
		return val;
	}
}

class HelloWorld {
	public static void main(String[] args) {
		test obj = new test(20);
		
		
		test objTwo = new test(5);
		
		objTwo.method(obj);
		
		System.out.println(objTwo.getVal());
	}
}