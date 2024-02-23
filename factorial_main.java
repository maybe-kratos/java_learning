import java.util.*;

class fact_class{
	public static long fact(int n){
		long factorial;
		
		if (n == 1){ factorial = 1; }
		else{ factorial = n * fact(n-1); }
		
		return factorial;
	}
}
class factorial_main{
	public static void main(String args[]){
		
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Enter the number to find it's factorial :");
		int n = sn.nextInt();
		
		fact_class f1 = new fact_class();
		long result = f1.fact(n);
		System.out.println("Factorial of "+n+" is :"+result);
		
		
	}
}