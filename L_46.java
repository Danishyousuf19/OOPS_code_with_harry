
class officer{
	int id ;
	int salary;
	String post;
	//constructor
	 officer(){
		System.out.println("i m constructor of a base");
	}
	 officer(int x){
			System.out.println("i m constructor of a base with arg x changed by super :"+x);
		}
	 officer(int x,int y){
			System.out.println("i m constructor of a base with arg x and y changed by super:"+x+" "+y);
		}
	 //below only used in case of private
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return post;
	}
	public void setName(String name) {
		this.post = name;
	}
	public void OVERRIDE() {
		System.out.println("can u overrude me");
	}
	public int overrr()
	{
		return 3;
	}
	public void poste() {
		System.out.println("dynamic method dispatch in base");
	}		
}
class local extends officer{
	String name;
	public void ar() {
		System.out.println(id);
	}
	//constructor with overloading 
	local(){
		super (0);
		System.out.println("i m constructor of a derived without  arg");
	}
	local (int c,int d){
		//super();//calls base constructor without arg 
		//super(33);//calls base constructor with one arg 
		super(33,43);//calls base constructor with two arg 
		System.out.println("\"i m constructor of a derived with arg c and d"+c+" "+d);
	}
	//dynamic method dispatch
	public void poste() {
		System.out.println("dynamic method dispatch in derived");
	}
}
//derived from derived;
class child extends local//officer
{
	//Override me
	public void OVERRIDE() {
		System.out.println("YES I HAVE OVERRIDED BASE METHOD");
	}
	public void poste() {
		System.out.println("dynamic method dispatch in derived fro derived");
	}
	public int overrr() {
		return 44;//return type must be same
	}
	String name;
	child()
	{
		super (0,0);
		System.out.println("i m local child");
	}
}

public class L_46 {

	

	public static void main(String[] args) {
		// constructor in inherited class
//calling base
		officer danish =new officer();//calls base constructor without arg 
		officer yasir =new officer(3444);//calls base constructor with  1 arg 
		officer suzi =new officer(3444,2323);//calls base constructor with  2 arg 
//calling derived 
		local dan =new local();//calls base constructor without arg 
		dan.OVERRIDE();
		local suz =new local(3444,2323);//calls base constructor with  2 arg 
		//using super will shift base constructor in aacc.to super arg
		child loca=new child();
		loca.OVERRIDE();
		//dynamic method dispatch
		officer faiza =new local();
		faiza.poste();
		local dani= new child();
		
		
	}

}
