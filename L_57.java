interface camera{
	void takepicture();
	void recordvideo();
	//Important
	@SuppressWarnings("i am private no used directly by derived but can be use in defalt")
	private void greety() {
		System.out.println("i am private no used directly by derived but can be use in defalt");
	}
	default void noNeed(){
		greety();
		System.out.println("i am default no ned to be implemented");
	}
}
interface wifi{
	String []networks();
	void connect(String name);
}
class Phone1{
	void calling(int num) {
		System.out.println("calling "+ num);
	}
	void take(int numb) {
		System.out.println("connecting "+numb);
	}
}
//important
interface sample{
	void meth();
}
interface deri extends sample{//imp*************
	void m();
}
class chil implements deri{
	public void meth() {
		
	}
	public void m(){
		
	}//&%&%$$^$^#$%#$%^$%^#$56
}
class SmartPhone extends Phone1 implements wifi,camera{
public void takepicture() {
		System.out.println("taking photo");
	}
	public void recordvideo(){
		System.out.println("recording video");
	}
public String []networks() {
	System.out.println("network avaliable");
	String network[]= {"viv1804","redmi 9","jio fibre"};
		return network;
	}
	public void connect(String name){
		System.out.println("joining "+name);
		
	}
	//important
	@Override
	public void noNeed() {
		System.out.println("i am default with private (no used directly by derived but can be use in defalt"
				+ ") and i m overrided");
		
	}
	public void gps(){
		System.out.println("gps not enabled");
	}
}

public class L_57 {

	public static void main(String[] args) {
		// smartfone 
		SmartPhone vivo=new SmartPhone();
		vivo.calling(0);
		
String network[]=vivo.networks();
for(String name:network) {
	System.out.print(name+ ",");
}System.out.println();
vivo.connect("redmi 9");
//imp

vivo.noNeed();
//polymorp
camera hon =new SmartPhone();
hon.recordvideo();//only camera methods can be called
	}

}
