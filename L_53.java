abstract class principle{
public void salary() {
	System.out.println("two lakh");
}
principle(){
	System.out.println("constructor of pri...");
}
abstract void greet();
}
class teacher extends principle{
	void greet() {
		System.out.println("hello sir");
	}
	protected teacher (){
		System.out.println("const de tea");
	}
}
abstract class student extends principle{
	void gret() {
		System.out.println("no rules");
	}
}
//^^^^^^^^^^INTERFACE^^^^^^^^^^
interface bycycle{
	public void speedup(int inc);
	void brake(int dec);
}
interface cylce{
	void horn();
}
class aone implements bycycle,cylce{//implements 
	int speed =9;
	public void horn() {
		System.out.println("blow horn..");
	}
	public void speedup(int inc) {
		speed+=inc;
	}
	public void brake(int dec){speed-=dec;
}

}
class danish extends principle implements cylce,bycycle{//important differnce b/w two
	public void horn() {
		System.out.println("danish sound...");
		
	
	}
	public void speedup(int inc) {
		
	}
	public void brake(int dec) {
		
	}
	public void greet() {
		System.out.println("danish rules");
	}
}

public class L_53 {

	public static void main(String[] args) {
		// abstract and interfaces
teacher a=new teacher();
a.greet();
	}

}
