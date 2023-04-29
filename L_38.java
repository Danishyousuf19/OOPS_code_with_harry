import java.util.Scanner;
//create class before class
class employ{
	Scanner sc=new Scanner(System.in);
	
	
	int salary=sc.nextInt();
	
	int id=sc.nextInt();
	String name=sc.next();
	String post=sc.next();
	public  void employ_attributes() {

		System.out.println("my name is :"+name);
		System.out.println("my id is :"+id);
		System.out.println("my post is :"+post);
		System.out.println("my salary is :"+salary);
	}
	
}
//q1employ classl39
class employe1{
Scanner sc=new Scanner(System.in);
	
	//for user input
	int salary=sc.nextInt();
	String name=sc.next();
	//properties
	public void setname(String a) //setting
	{
		name=a;
	}
	public String getname() //getting 
	{
		return name;
	}
	public void setsalary(int c) {
		salary=c;
	}
	public int getsalary() {
		return salary;
	}
	
	
}
//main class
public class L_38 {

	public static void main(String[] args) {
		// EMPLOY CLASS calling
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your details\na:id\nb:name\nc:post\nd:salary\n");
employ random =new employ();//creating object
random.id=sc.nextInt();
random.name=sc.next();
random.post=sc.next();
random.salary=sc.nextInt();
random.employ_attributes();//calling class employ and its method
//q1
employe1 danish=new employe1();
//for overriding class variables
danish.name="danish";
danish.salary=3232;
System.out.println(danish.getname());
System.out.println(danish.getsalary());
	}

}
