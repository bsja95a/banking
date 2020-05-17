package burhan_bank;

public class validation {
    public validation(String name, String addresses, String dob, String number, String email){
            if(String.valueOf(number).length() != 11){
                System.out.println("The entered phone number is not 11 digits long");
                Main.main(null);
            }
            else if (!email.contains("@") && !email.contains(".")) {
                System.out.println("Please enter a valid email address");
                Main.main(null);
            }
//            return 1;
    }
}
