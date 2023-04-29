import java.util.Scanner;

class limit5 extends Exception{
	public String getMessage() {
		
		return "limit reached";
		
	}
	
}
public class L_86 {
public static void indexs(int arr[]) throws limit5 {
	Scanner s=new Scanner(System.in);
	 boolean flag=true;int i=0;
    while(flag&i<5) {
    	System.out.println("enter index of array element");
       int x=s.nextInt();
      
 try{
		   System.out.println("element at given index is "+arr[x]);
		  break;
	   }
	   catch(Exception e) {i++;
		 //throw new limit5();
		  System.out.println(e.getMessage());
	   }
 }

}
 
	public static void main(String[] args) throws limit5 {
		// TODO Auto-generated method stub
		int arr[]=new int[4];
		arr[0]=33;
		arr[1]=53;
		arr[2]=3;
		arr[3]=23;
		indexs(arr);
	
	
		
	}

}


// Problem 4 and 5
//import java.util.Scanner;
//class MaxRetriesExceededException extends Exception{
//    @Override
//    public String toString(){
//        return "\nMaxRetriesExceededException: "+getMessage();
//    }
//    @Override
//    public String getMessage(){
//        return "You have exceeded the maximum limit of 5 attempts to access the array.";
//    }
//}
//
//public class PS_03_KeepAccessingAnArray {
//    static void accessArray()throws MaxRetriesExceededException{
//         // declaration
//         int index,c = 1;
//         String [] vegetables = {"Potato","Garlic","Ginger","Tomato","Onion"};
//         boolean isIndexValid;
//         do {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter an index number - ");
//             index = sc.nextInt();
//             try{
//                 System.out.print("Element at index "+index+" - "+vegetables[index]);
//                 isIndexValid = true;
//                 sc.close();
//             }
//             catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Invalid Index.\n\tTry again");
//                 isIndexValid = false;
//             }
//             if (isIndexValid==true)
//                 break;
//             else if(c==5){
//                sc.close();
//                 throw new MaxRetriesExceededException();
//             }
//            c++;
// 
//         }while(c<=5);
//    }
//    public static void main(String[] args) {
//        try{
//            accessArray();
//        }
//        catch(MaxRetriesExceededException m){
//            m.printStackTrace();
//        }
//    }
//}