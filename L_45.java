class animals{
	 int age ;
	int no;
	String name;
	//without constructors
animals (){
	System.out.println("chk");
}
	public int getage() {
		return age;
	}
	public void setage(int a) {
		this.age=a;
		System.out.println("age:"+age);
	}
	public int getno() {
		return age;
	}
	public void setno(int a) {
		this.no=a;
		System.out.println("no:"+no);
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
		System.out.println("name:"+name);
	}
}
class dogs extends animals{
	String bark,legs;
	
	public String getbark() {
		return bark;
	}
	public void setbark(String name) {
		this.bark=name;
		System.out.println("bark:"+name);
	}
	public String getlegs() {
		return legs;
	}
	public void setlegs(String name) {
		this.legs=name;
		System.out.println("legs:"+name);
	
	}
}
class lamb extends animals {
	lamb (){
		System.out.println();
	}
}
public class L_45 {

	public static void main(String[] args) {
		// inheritance
		animals dog=new animals();
		dog.setage(88);
		dog.getage();
		dogs bull=new dogs();
//no out put without constructors
		//call methods
		bull.setbark("yes");
		bull.getbark();
		bull.setage(98);//call base from derived
		bull.getage();
		bull.age=23;//as it is not private
		//smiler for others
		
		
	}

}
