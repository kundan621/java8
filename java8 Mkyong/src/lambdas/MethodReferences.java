package lambdas;

public class MethodReferences {
	
	public static void main(String[] args) {
		Thread t=new Thread(()->printmessage());
		t.start();

		//method references: if no inpuut arguments
		Thread t1=new Thread(MethodReferences::printmessage);
		t1.start();
	}
	
	public static void printmessage() {
		System.out.println("Hello");
	}

}
