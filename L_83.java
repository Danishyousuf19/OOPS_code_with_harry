import java.util.Scanner;

class adult extends Exception{
	@Override
	public String toString() {
	//	return super.toString()+"i m to string and with out(super.toString)" ;
		return "i m to Sting";
	}
	@Override
	public String getMessage() {
		return super.getMessage()+"i m get message";
	}
}


public class L_83 {

	public static void main(String[] args) {
		// Throw
		Scanner s=new Scanner(System.in);
		System.out.println("entr age");
      int a=s.nextInt();
      if(a<18) {
    	  try {
    		throw new adult();
    		 // throw new ArithmeticException();//error unreach
    		 // throw new adult();//error unreach
    	  }
    	  catch(Exception e) {
    		System.out.println(e);
    		System.out.println(e.getMessage());
    		
    		System.out.println(e.toString());
    		e.printStackTrace();
    	  }
      }
      else {
    	  System.out.println("you are adult");
      }
	}

}
