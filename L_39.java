//q1
class phone{
	public void ring() {
		System.out.println("ringing...");
	}
	public void vibrate() {
		System.out.println("vibrating..");
	}
	public void call() {
		System.out.println("calling...");
	}
	public void delete() {
		System.out.println("deleting...");
	}
}
class figures {
	int length=4;
	int bredth=3;
	int radius=3;
	public void areaofsquare()
	{
		System.out.println(length*length);//Smiler for other
	}
}
public class L_39 {

	public static void main(String[] args) {
		//Practice
phone nokia=new phone();
nokia.call();
nokia.delete();
nokia.ring();
nokia.vibrate();
figures square=new figures();
// square.length=44;
square.areaofsquare();
	}

}
