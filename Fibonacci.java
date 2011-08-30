public class Fibonacci
{
	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.println("Usage: java Fibonacci <number> [number...]");
			System.out.println("Anything past the 92nd number will fail.");
		}
		else
		{
			for (int i = 0; i < args.length; i++)
			{
				int num = Integer.parseInt(args[i]);
				if (num < 93)
				{
					System.out.println("\n" + num + "th Fibonacci number");
					System.out.println("Fast: " + fast(num));
					System.out.println("Slow: " + slow(num));
				}
				else
				{
					System.out.println("This implmentation maxes out at the 92nd number: " + fast(92));
				}
				System.out.println();
			}
		}
	}
	
	private static long fast(int nth)
	{
		if (nth < 3)
		{
			return 1;
		}
		long two_previous = 1;
		long one_previous = 1;
		long current = 2;
		for (int i = 2; i < nth; i++)
		{
			current = two_previous + one_previous;
			two_previous = one_previous;
			one_previous = current;
		}
		return current;
	}
	
	private static long slow(int nth)
	{
		if (nth < 3)
		{
			return 1;
		}
		return slow(nth - 2) + slow(nth - 1);
	}
}
