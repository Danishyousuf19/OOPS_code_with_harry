class th1 extends Thread{
	public void run() {
		System.out.println("hi :"+this.getName());
	}
}



public class L_74 {

	public static void main(String[] args) {
		// priorty
		th1 t1=new th1();
		th1 t2=new th1();
		th1 t3=new th1();
		th1 t4=new th1();
		th1 t0=new th1();
		t1.start();
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.start();//default proirty
		t4.start();
		t4.setPriority(Thread.NORM_PRIORITY);
		t0.start();
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		
		
		
	}

}
