
public class recurssion {

	private static long [] fibonacciCache;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 93;
		fibonacciCache = new long [n + 1];
		
		for(int i = 0; i <= n; i++) {
			//System.out.println(fibonacci(i));
			System.out.print(fibonacci(i) + " ");
		}
		
		

	}

	private static long fibonacci(int n) {
		// TODO Auto-generated method stub
		if(n <= 1) {
			return n;
		}
		
		if (fibonacciCache[n] != 0 ) {
			return fibonacciCache[n];
		}
		
		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		fibonacciCache[n] = nthFibonacciNumber;
		return nthFibonacciNumber;
	}

}
