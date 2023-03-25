import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		
		String repeat;
		Scanner input = new Scanner(System.in);
		boolean proceed = true;
		
		while(proceed == true) {

        try {
            String[] studentName = {"Jon Renzo Toledo", "Lorenzo Villarico", "Michael Zander Boncodin", "Francisca Ruiz", "Amparo Lorenzo", "Nicolas Suarez", "Ivan Torres", "María Pilar Lopez", "Inés Alvarez", "Mohamed Flores"};
            int[] studentID = {23001, 23002, 23003, 23004, 23005, 23006, 23007, 23008, 23009, 23010};
            String[] courseYr = {"BSCS1A", "BSCS2A ", "BSCS3A", "BSCS4A", "BSIT1A", "BSIT1B", "BSIT1C", "BSIT1D", "BSIT2A", "BSIT2B"};
            String[] emailID = {"jonrenzo@gmail.com", "lorenovillarico@gmail.com", "zanderboncodin@gmail.com", "franciscaruiz@gmail.com", "lorenzoamaro@gmail.com", "suareznicilas@gmail.com", "torresivan@gmail.com", "lopezmaria@gmail.com", "alvarezines@gmail.com", "floresmohamed@gmail.com"};

                System.out.print("Student ID: ");
                int x = input.nextInt();

                for (int i = 0; i < studentID.length; i++) {
                    if (x == studentID[i]) {
                        System.out.println("Student Name        : " + studentName[i]);
                        System.out.println("Course & Yr/Sec     : " + courseYr[i]);
                        System.out.println("Email Address       : " + emailID[i]);
                    }
                }

                System.out.print("Proceed? [yes/no]: ");
                String answer = input.next();

                if (answer.equalsIgnoreCase("yes")) {
                    proceed = true;
                } else if (answer.equalsIgnoreCase("no")) {
                    proceed = false;
                } 

        } catch (Exception e) {

            System.out.println("INVALID INPUT!!!");
            
            System.out.print("Proceed? [yes/no]: ");
            repeat = input.next();
            
            if (repeat.equalsIgnoreCase("yes")) {
            	proceed = true;
            	System.out.println("lmao");
            }
            else {
            	proceed = false;
            }

            

            
            
           
        }
		}




    

	}

}

