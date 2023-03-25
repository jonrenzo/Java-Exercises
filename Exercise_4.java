import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		int payRate = 35;
		int overtimeRate = (int) (1.5 * payRate);
		int overtimePay = 0;
		int normalPay = 0;
		int totalPay = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter Work Hours  : ");
		int workHours = input.nextInt();
		
		if(workHours >= 40) {
			normalPay = workHours * payRate;
			overtimePay = ((workHours - 40) * overtimeRate);
			totalPay = normalPay + overtimePay;
			
			System.out.println("Normal Pay   : P" + normalPay);
			System.out.println("Overtime Pay : P" + overtimePay);
			System.out.println("Total Pay    : P" + totalPay);
			
		}
		else {
			normalPay = workHours * payRate;

			System.out.println("Normal Pay   : P" + normalPay);
			System.out.println("Overtime Pay : P" + overtimePay);
			System.out.println("Total Pay    : P" + totalPay);
		}
		
		

	}

}
