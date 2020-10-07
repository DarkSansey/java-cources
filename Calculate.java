public class Calculate {
	public static void main(String[] args){
	System.out.println("Calculate...");
	int first = Integer.valueOf(args[0]);
	int second = Integer.valueOf(args[1]);
	int summ = (int)(first + second);
	int umnoj = (int)(first * second);
	double delen = (double)(first/second);
	int step1 = first*first;
	int step2 = second*second;
	int razn = first-second;
	System.out.println("Sum = " + summ);
	System.out.println("Umnoj = "+ umnoj);
	System.out.println("Razn = " + razn);
	System.out.println("Step1 = "+ step1);
	System.out.println("Step2 = "+ step2);
	System.out.println("delen = "+delen);
	}
}