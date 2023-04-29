class employee{
	private int id;
	private String name;
	public void setid(int a) {
		
		this.id=a;
	}
	public int getid() {
		return id;	
	}
	public String getname() {
		return name;
	}
	public void setname(String a) {
		if(a.length()<8) {
			System.out.println("wrong name");//error massage
		}else {
		this.name=a;}
	}
}
//getter and setter
class cylinder{
	private int height ;
	private int radius;
	//by using getter and setter
	public int getheight() {
		return height;
	}
	public int getradius() {
		return radius;
	}
	public void setheight(int height) {
		this.height=height;
	}
	public void setradius(int radius) {
		this.radius=radius;
	}
	
	public void area() {
		System.out.println("area of cylinder : "+ 
	((2*3.14*radius *height)+(3.14*radius*radius*height)));//lly for volume
	}
	
}
class cylinxxx{
	private int height ;
	private int radius;
	//constructor
	public cylinxxx(int height,int radius) {
		this.height=height;
		this.radius=radius;
	}
	public void area() {
		System.out.println("area of cylinder : "+ ((2*3.14*radius *height)+(3.14*radius*radius*height)));//lly for volume
	}
}
//rectangle
class rectangle{
	private int height ;
	private int bredth;
	//constructor
//	public rectangle(int height,int bredth) {
//		this.height=height;
//		this.bredth=bredth;
//	}
	public int getheight() {
		return height;
	}
	public int getbedth() {
		return bredth;
	}
	//constructer overide //needs getter no setter
	public rectangle() {
		this.height=5;
		this.bredth=4;
	}
	//custom parameter 
	public rectangle(int height,int bredth) {
		this.height=height;
		this.bredth=bredth;
	}
	public void area() {
		System.out.println("area of cylinder : "+ height*bredth);//lly for volume
	}
	}
	
public class L_40 {

	public static void main(String[] args) {
		// GETTER AND SETTER PRIVATE;
employee danish =new employee();
//danish.id;--->error use get and set
danish.setid(25008);
int getted_id=danish.getid();
System.out.println(getted_id);
danish.setname("yasir");
System.out.println(danish.getname());
//cylinder
cylinder ab=new cylinder();
ab.setheight(13);
ab.setradius(2);
System.out.println(ab.getheight());
System.out.println(ab.getradius());
ab.area();//USING CONSTRUCTORS
cylinxxx rt=new cylinxxx(13,2);
rt.area();
//given  parameter of rectangle
rectangle rr=new rectangle();
System.out.println(rr.getbedth());
System.out.println(rr.getheight());
//override custom override and custom
rectangle over=new rectangle(4,4);
over.area();
	}

}
