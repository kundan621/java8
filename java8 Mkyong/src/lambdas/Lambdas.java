package lambdas;

public class Lambdas {
	public static void main(String[] args) {
		
		//we don't need any class for the implementation of the interface we can directly do using the lambda
		//example 1
		Test t=()->System.out.println("xyz");
		t.doOutput();
		printOutput(()->System.out.println("lets see"));
		//example 2
		Test1 t1=(x,y)-> x+y;
		System.out.println(t1.doOutput(2, 5)); 
		
		//inner class way
		Test t2=new Test() {
			
			@Override
			public void doOutput() {
				System.out.println("helloworld");
				
			}
		};
		t2.doOutput();
		Test.method3();
		t.methodtest();
		
	}

	private static void printOutput(Test t ) {
		t.doOutput();
		
	}
	
	
	
	

}
@FunctionalInterface
interface Test{
	void doOutput();//only one abstract methods and default and static methods are allowed
	default void methodtest(){
		System.out.println("Default method");
	}
	default void methodtest2(){
		System.out.println("Default method");
	}
	static void method3() {
	System.out.println("method 3");
	}
}

@FunctionalInterface
interface Test1{
	int doOutput(int x, int y);
}
