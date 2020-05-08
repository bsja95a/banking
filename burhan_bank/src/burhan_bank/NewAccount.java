package burhan_bank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class NewAccount {
    public NewAccount(String name, String addresses, String dob, String number, String email) throws IOException {

        Random rand = new Random();
        int pin = rand.nextInt((9999 - 1000) + 1) + 10;
        String sortCode = "23-76-54";
        int accountNumber = 0;

            // create a writer
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("accounts.csv"));

            // write header record
            writer.write("Name,Address,DOB,Number,Email,Account number,Pin,Sort code");
            writer.newLine();

            // write all records

                writer.append(String.join(name,",", addresses,",",dob,",",number,",",email,",",Integer.toString(accountNumber),",",Integer.toString(pin),",",sortCode));
                writer.newLine();

            //close the writer
            writer.close();

        }
    }

