class circle{
private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;}
circle(){
	System.out.println("no arg circle ie default");

}
//constructor
circle(int r){this.radius=r;
	System.out.println("i m constructor of circle with radius : "+r);
}
public void area(){
	System.out.println("area of circle : "+(3.14*this.radius*this.radius));
}
}
class cylinder1 extends circle{
	private int height;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	cylinder1(int h,int r){
		//super(r);
		this.height=h;
		System.out.println("i m constructor of cylinder wit radius and height : "+r+" "+h);
	}
	public void volume() {
		System.out.println("volume of cylinder : "+(3.14*this.height*this.getRadius()));
	}
}

public class L_52 {

	public static void main(String[] args) {
		//practice set 10 Q1
cylinder1 a=new cylinder1(2,1) ;
a.setHeight(2);//override

a.volume();
a.area();
circle c=new circle(2);
	c.area();
	System.out.println(c.getRadius());

	}

}
