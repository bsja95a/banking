package burhan_bank;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Burhan's Bank, Please pick a banking option below");
		System.out.println("1 - Join the bank");
		System.out.println("2 - Login to your bank account");
		System.out.println("3 - Exit the bank");
		
		Selection();


		
	}

	private static void Selection() {
		Scanner sc = new Scanner(System.in);
		int option;
		try{
			
			option = sc.nextInt();
			if (option == 1 ) {
				//join the bank
			}
			else if (option == 2) {
				//login to the bank
			}
			else if (option == 3) {
				System.out.println("Existing - Goodbye");
				System.exit(0);
			}
			else {
				System.out.println("Please select a valid option");
				Main.main(null);
			}
		   	    
		}catch(InputMismatchException e){
		    System.out.println("Please enter the option nunber only");
		    Main.main(null);
		}
		sc.close();
		
	}

}
