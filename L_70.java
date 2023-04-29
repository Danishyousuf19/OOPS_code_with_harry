class thread1 extends Thread{
	//constructor
		public thread1(String name) {
			super(name);
			
		}
	public void run() {int i=0;
		while(i<44) {
		System.out.println("running and caling");i++;}
	}
}

class thread2 extends Thread{
	//constructor
	public thread2(String name) {
		super(name);
		
	}
	public void run() {int i=0;
		while(i<44) {
		System.out.println("dancing");i++;}
	}
}

////Threading from runnable class
class thRUN implements Runnable{
	public void run() {
		while (true) {
			System.out.println("runnable");
		}
	}
	
}
class thRUN2 implements Runnable{
	public void run() {
		while (true) {
			System.out.println("hehe");
		}
	}
}


public class L_70 {

	public static void main(String[] args) {
		// THREADing from THREAD CLASS
		thread1 t1=new thread1("78587yfuyfu");
		
		thread2 t2=new thread2("daniah");
	//	t1.start();//to run thread
	//	t2.start();
		 System.out.println("id of t2 "+t2.getId()+"\n name"+t2.getName());
		 System.out.println("id of t1 "+t1.getId()+"\n name"+t1.getName());
		//Threading from runnable class
		thRUN bullet1=new thRUN();//making object
		Thread gun1=new Thread(bullet1);//implementing
		
		thRUN2 bullet2=new thRUN2();//making object
		Thread gun2=new Thread(bullet2);//implementing
		//gun1.start();
	//	gun2.start();//running code
		

	}

}
