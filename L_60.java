 interface  animal{
	void eats();  
  }
class monkey
{
	void jump() {
		System.out.println("jumps");
	}
}
class human extends monkey implements animal{
	void talk() {
		System.out.println("speak...");
	}
	public void eats() {
		System.out.println("eats");
	}
}
//q2
abstract class pen{
	void write () {
		System.out.println("write");
	}
	abstract void refil();
}
class ballpen extends pen{
	void write () {
		System.out.println("writing");
	}
	void refil() {System.out.println("refil");
}
}
//q3
interface remote{
	void button();
}
interface smartremote extends remote{
	void mouse();
}
class tv implements smartremote{
public void mouse() {
	System.out.println("mouse");
}
public void button() {
	System.out.println("buttons");
}
}
//libary
class libary{
	int noBook;
	String books[];
	libary(){
		this.books=new String[100];
		this.noBook=0;
	}
	void addbook(String book) {
		System.out.println("added "+book);
	this.books[noBook]=book;noBook++;	
	}
	void avail() {System.out.println("books here are:");
		for(String b:this.books) {
			if(b==null) {continue;}
			System.out.println("* "+b);
			
		}
	}
	void issue(String book){
		for(int i=0;i<this.books.length;i++) {
			if(this.books.equals(book)) {
				System.out.println("yes issued");
				this.books[i]=null;return;
			}
		}System.out.println("no found");
	}
	void returnBook(String book) {
		addbook(book);
	}
}
public class L_60 {

	public static void main(String[] args) {
		//questions
human u =new human();
u.jump();
//polymorphism
monkey you=new human();
you.jump();
//q2
ballpen a=new ballpen();
a.refil();
//q3 with polymorphism
remote aaa=new tv();
aaa.button();
libary iter =new libary();
iter.addbook("jee");
iter.addbook("Neet");
iter.addbook("cbse");
iter.avail();
iter.issue("jee");
iter.avail();
iter.returnBook("jee");
iter.avail();
}

}
