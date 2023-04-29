
public class L_85 {
	public static int div() {
		try {
			int a=9;int b=0;
			return a/b;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("excuts any way");
		}
		return -1;
		
	}
	public static void main(String[] args) {
		//System.out.println(div());
		
	
	int a=99;int b=6;
	while (true) {
		try {
		System.out.println("a/"+b+":"+a/b);	
		}
		catch (Exception e) {
			System.out.println(e);break;
		}
		

	finally {b--;
		System.out.println("finally b is = "+b);
	}
		}
	}

}
