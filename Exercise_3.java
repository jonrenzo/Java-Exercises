import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number    : ");
		int fnum = input.nextInt();
		System.out.print("Enter Second Number   : ");
		int snum = input.nextInt();
		
		System.out.println("Sum                 : " + (fnum + snum));
		System.out.println("Difference          : " + (fnum - snum));
		System.out.println("Product             : " + (fnum * snum));
		System.out.println("Quotient            : " + (fnum / snum));
		
		
		
		

	}

}
