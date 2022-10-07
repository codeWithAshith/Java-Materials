package EmailApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utils.welcome();
        Email email = new Email();
        EmailService emailService = new EmailServiceImp(email, scanner);
        emailService.register();
        emailService.generateEmail();
        emailService.generatePassword(6);

        boolean isExist = true;
        while (isExist) {
            Utils.showChoice();
            int choice;
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> emailService.showUserInfo();
                    case 2 -> emailService.updatePassword();
                    case 3 -> emailService.updateMailCapacity();
                    case 4 -> emailService.setAlternateEmail();
                    case 5 -> emailService.saveToFile();
                    case 6 -> emailService.readFromFile();
                    case 7 -> {
                        Utils.thankYou();
                        isExist = false;
                    }
                    default -> System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Invalid character entered");
                scanner.nextLine();
            }

        }
    }
}
