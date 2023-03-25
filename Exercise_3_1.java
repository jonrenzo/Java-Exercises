import java.util.Scanner;

public class Exercise_3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter Num1 : ");
		int num1 = input.nextInt();
		
		System.out.print("Please Enter Num2 : ");
		int num2 = input.nextInt();
		
		System.out.println();
		
		System.out.println("The quotient is " + (num1 / num2));
		System.out.println("The remainder is " + (num1 % num2));

	}

}
