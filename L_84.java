class negativeradius extends Exception{
	@Override
	public String toString() {
	//	return super.toString()+"i m to string and with out(super.toString)" ;
		return "negative radius";
	}
	@Override
	public String getMessage() {
		return "negative radius";
	}
}
public class L_84 {

	public static double area(double r) throws negativeradius{
		if(r<0) {
			throw new negativeradius();
			}
		return 3.14*r*r;
		
	}
	///////////////////////////////////////////////////////////////////////
	public static int divide(int b,int r) throws ArithmeticException{
		
		return r/b;
		
	}
	public static void main(String[] args) {
		// ThrowS finaly 
try {
	System.out.println(area(-11));
	//throw new negativeradius();
	
}
catch(Exception e) {
	//System.out.println("error");
	System.out.println(e.getMessage());
}////////////////////////////////////////////////////////////////////////////////
try {
	System.out.println(divide(0,11));
	
}
catch(Exception e) {
	System.out.println("error divide by zero");
}
	}

}
