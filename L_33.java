
public class L_33 {
	//VARARGS
static int sumvar(int s,int ...array) {
	int sum=0;
	
	for(int element :array) {
		sum+=element;
	}return sum+s;
	
}
//RECURSION
//sum of n;
static int sum_rec(int n) {
	//<<<------+++BASE CONDITION+++------>>>
	if(n==0)
		return 0;
	return n+sum_rec(n-1);
}
//fibonachhi
static int fib_rec(int h) {
	//###   base condition   ###
	if(h==1|h==2)
		return h-1;
	return fib_rec(h-2)+fib_rec(h-1);
}
//pattern
static void pattern_1_rec(int n) {
	if(n>0) {
		pattern_1_rec(n-1);
		for (int i=0;i<n;i++) {
			System.out.print(" * ");
		}System.out.println();
	}
}
static void pattern_2_rec(int n)
{	if(n>0) {
		for(int i=0;i<n;i++) {
			System.out.print(" * ");	
		}System.out.println();pattern_2_rec(n-1);
	}
	
}
	public static void main(String[] args) {
		
		// varargs
System.out.println("var args___"+sumvar(2,4,5,2,1,3,4));
        //RECURSION
System.out.println("rec ___"+sum_rec(10));
System.out.println("rec ___"+fib_rec(2));
for (int fib=1;fib<=10;fib++) {
	System.out.print(fib_rec(fib)+" ");	
}System.out.println();
pattern_1_rec(6);
System.out.println();
pattern_2_rec(6);
System.out.println();


	}

}
