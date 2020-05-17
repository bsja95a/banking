package burhan_bank;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class addAccount {

    public  addAccount(String name, String addresses, String dob, String number, String email) throws IOException {

        Random rand = new Random();
        int pin = rand.nextInt((9999 - 1000) + 1) + 10;
        String sortCode = "23-76-54";
        int accountNumber = rand.nextInt((99999999 - 10000000) + 1) + 10;

        BufferedWriter writer = Files.newBufferedWriter(Paths.get("accounts.csv"), StandardOpenOption.APPEND,StandardOpenOption.CREATE);
        writer.write(String.join( "",name,",", addresses,",",dob,",",number,",",email,",",Integer.toString(accountNumber),",",Integer.toString(pin),",",sortCode));
        writer.newLine();
        writer.close();
        System.out.println("Welcome to Burhan's Bank  \nYour account number is: "+accountNumber+"\nYour pin number is: "+pin);
    }
}
