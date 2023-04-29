class zeroExp extends Exception{
	public String toString() {
		return "cannot divide by zero";
	}
}
class maxExp extends Exception{
	public String toString() {
		return "max inputted";
	}
}


class NewCalculator{
	double add(double a,double b) throws maxExp {
		if(a>1000|b>1000) {
			throw new maxExp();
		}
		return a+b;
	}
	double minus(double a,double b)  throws maxExp{
		if(a>1000|b>1000) {
			throw new maxExp();
		}
		return a-b;
	}
	double divide(double a,double b)throws zeroExp ,maxExp{
		if(a>1000|b>1000) {
			throw new maxExp();
		}
		if(b==0) {
			throw new zeroExp();
		}
		return a/b;
	}
	double mult(double a,double b) throws maxExp {
		if(a>1000|b>1000) {
			throw new maxExp();
		}
		return a*b;
	}
}




public class L_103 {

	public static void main(String[] args) throws zeroExp ,maxExp{
		// custom calculator
		NewCalculator c =new NewCalculator();
	//	c.divide(2, 0);
	//	c.add(10000, 50);
		
		
	}

}
