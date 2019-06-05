package lambdas;

public class Runnable1 {
	
	public static void main(String[] args) {
	
		
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello in thread");
				
			}
		});
		
		t.start();
		
		Thread t2=new Thread(()->System.out.println("Hello in lamda thread"));
		t2.start();
	}

}
