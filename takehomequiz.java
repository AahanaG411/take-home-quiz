public class takehomequiz
{
	public static void main(String[] args)
	{
        sumInterface rangeSum = (a, b) -> {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        };

		System.out.println("Sum: " + rangeSum.sumOfRange(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
}