/* Name of the class has to be "Main" only if the class is public. */
class FibonacciDP
{
	static int dp_fib_generator(int n){
		int [] fib = new int[n+1];
		fib[0]=0;
		fib[1]=1;
		for(int i = 2;i<=n;i++){
			fib[i]= fib[i-1]+fib[i-2];
		}
		return fib[n];
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println("Nth Fibonacci - "+ dp_fib_generator(5));
	}
}