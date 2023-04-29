
class th12 extends Thread{
	public void run() {
		while(true) {
				System.out.println("hi :");
		}
	
	}
}class th2 extends Thread{
	public void run() {
		while(true) {
			
				System.out.println("thankue :");
				
				try {
					th2.sleep(22);
				}
				catch(InterruptedException e) {
				e.printStackTrace();
				}	
		}
	
	}
}


public class L_75 {

	public static void main(String[] args) {
		// THREAD METHODS
		th12 t1= new th12();
		th2 t2= new th2();
t1.start();
//		try {
//			t1.join();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		t2.start();
		

	}

}
