package burhan_bank;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) {


		System.out.println("Welcome to Burhan's Bank, Please pick a banking option below");
		System.out.println("1 - Join the bank");
		System.out.println("2 - Login to your bank account");
		System.out.println("3 - Exit the bank");
		System.out.println("4 - Currency conversion");

		Selection();
	}

	private static void Selection() {
		Scanner sc = new Scanner(System.in);

		int option;
		String name;
		String addresses;
		String dob;
		String number;
		String email;

		try{

			option = sc.nextInt();
			sc.nextLine();
			if (option == 1 ) {

				System.out.println("Please enter your name");
				name = sc.nextLine();
				System.out.println("Please enter your addresses");
				addresses = sc.nextLine();
				System.out.println("Please enter your date of birth");
				dob = sc.nextLine();
				System.out.println("Please enter your phone number");
				number = sc.nextLine();
				System.out.println("Please enter your email");
				email = sc.nextLine();
				validation v = new validation(name, addresses, dob, number, email);

//				if(v.equals(1)){
					addAccount a = new addAccount(name, addresses, dob, number, email);
					Main.main(null);
//				}

			}
			else if (option == 2) {
				//login to the bank
			}
			else if (option == 3) {
				System.out.println("Exiting - Goodbye");
				System.exit(0);
			}
			else if (option == 4){
			    new currency();
            }
			else {
				System.out.println("Please select a valid option");
				Main.main(null);
			}

		}catch(InputMismatchException | IOException e){
		    System.out.println("Please enter the option nunber only");
		    Main.main(null);
		}
		sc.close();

	}

}
