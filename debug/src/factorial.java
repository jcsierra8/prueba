
public class factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));

	}
	
	public static int factorial(int num){
		
		int factorial = 1;
		
		for(int i=1;num>i;num--){
			
			factorial=num*factorial;
		}
		return factorial;
	}
}
