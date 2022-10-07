package EmailApplication;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Random;
import java.util.Scanner;

public class EmailServiceImp implements EmailService {
    private final Email email;
    private final Scanner scanner;

    private final File file = new File("src/main/resources/email.txt");

    public EmailServiceImp(Email email, Scanner scanner) {
        this.email = email;
        this.scanner = scanner;
    }

    @Override
    public void register() {
        System.out.print("Enter your first name: ");
        String fName = scanner.next();
        email.setfName(fName);

        System.out.print("Enter your last name: ");
        String lName = scanner.next();
        email.setlName(lName);

        System.out.println("Enter your department:");
        System.out.println("1. Sales");
        System.out.println("2. Development");
        System.out.println("3. Accounts");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            email.setDept("sales");
        } else if (choice == 2) {
            email.setDept("development");
        } else if (choice == 3) {
            email.setDept("accounts");
        }

        System.out.println("Creating account...");
    }

    @Override
    public void generateEmail() {
        System.out.println("Generating email...");
        String generatedEmail = email.getfName().toLowerCase() + email.getlName().toLowerCase() +
                "@" + email.getDept().toLowerCase() + ".company.com";
        email.setEmail(generatedEmail);
        System.out.println("Email generation completed.");
    }

    @Override
    public void generatePassword(int length) {
        System.out.println("Generating password...");
        Random random = new Random();
        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String symbols = "!@#$%^&*()_-+=";
        String validChars = capitalChars + smallChars + numbers + symbols;
        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            passwordBuilder.append(validChars.charAt(random.nextInt(validChars.length())));
        }
        email.setPassword(passwordBuilder.toString());
        System.out.println("Password generation completed.");
    }

    @Override
    public void showUserInfo() {
        System.out.println("-----Info-----");
        System.out.println("Name: " + email.getfName() + " " + email.getlName());
        System.out.println("Dept: " + Utils.capitalize(email.getDept()));
        System.out.println("Email: " + email.getEmail());
        System.out.println("Password: " + email.getPassword());
        System.out.println("Mail Capacity: " + email.getMailCapacity());
        System.out.println("Alternate mail: " + email.getAlternateEmail());
        System.out.println("");
    }

    @Override
    public void updatePassword() {
        System.out.print("Enter your password: ");
        String oldPassword = scanner.next();
        if (oldPassword.equals(email.getPassword())) {
            System.out.print("Enter your new password: ");
            String newPassword = scanner.next();
            email.setPassword(newPassword);
            System.out.println("Password updated successfully");
        } else {
            System.out.println("Invalid Password");
        }
    }

    @Override
    public void updateMailCapacity() {
        System.out.println("Email capacity: " + email.getMailCapacity() + "mb");
        System.out.print("Enter new mailbox capacity: ");
        int capacity = scanner.nextInt();
        email.setMailCapacity(capacity);
        System.out.println("Mail capacity updated successfully");
    }

    @Override
    public void setAlternateEmail() {
        System.out.print("Enter alternate email: ");
        String alternateEmail = scanner.next();
        email.setAlternateEmail(alternateEmail);
        System.out.println("Alternate Mail updated successfully");
    }

    @Override
    public void saveToFile() {
        try {
            if (file.createNewFile()) {
                System.out.println("File has been created.");
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("Writing to a file...");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Name: " + email.getfName() + " " + email.getlName());
            fileWriter.append("\nDept: ").append(Utils.capitalize(email.getDept()));
            fileWriter.append("\nEmail: ").append(email.getEmail());
            fileWriter.append("\nPassword: ").append(email.getPassword());
            fileWriter.append("\nMail Capacity: ").append(String.valueOf(email.getMailCapacity()));
            fileWriter.append("\nAlternate mail: ").append(email.getAlternateEmail());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    @Override
    public void readFromFile() {
        System.out.println("Reading from file...");
        try {
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
