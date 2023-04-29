import java.util.Scanner;

public class L_81 {

	public static void main(String[] args) {
		// Exceptions\\\\\\\\\\\\\\\\
		//TRY AND CATCH
		int arr[]=new int[4];
		arr[0]=33;
		arr[1]=53;
		arr[2]=3;
		arr[3]=23;
		
		Scanner s=new Scanner(System.in);
//		System.out.println("enter index of array element");
//        int a=s.nextInt();
//        System.out.println("enter a no  by which you want to divide");
//        int b=s.nextInt();
//        try {
//        	System.out.println("element at given index is "+arr[a]);
//        	System.out.println("value = "+(arr[a]/b));
//        }
//        catch(ArithmeticException e) {
//        	System.out.println("error : "+e);
//        }
//        catch(ArrayIndexOutOfBoundsException e) {
//        	System.out.println("error : "+e);
//        }
//        catch(Exception e) {
//        	System.out.println("error : "+e);
//        }
//        
        //******************NESTED q1
        boolean flag=true;
        while(flag) {
        	System.out.println("enter index of array element");
            int a=s.nextInt();
            System.out.println("enter a no  by which you want to divide");
            int b=s.nextInt();
       try {
    	   System.out.println("allowed index upto 3");
    	   System.out.println("value = "+(arr[a]/b));
    	   try {
    		   System.out.println("element at given index is "+arr[a]);
    		   flag=false;
    	   }
    	   catch(ArrayIndexOutOfBoundsException e) {
    		   System.out.println("ex :level 1 "+e);
    	   }
       }
       catch(Exception e) {
    	   System.out.println("ex :level 2 "+e);
    	   
       }}
        
        
	}

}
