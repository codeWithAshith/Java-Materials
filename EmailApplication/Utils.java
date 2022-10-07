package EmailApplication;

public class Utils {
    public static void welcome() {
        System.out.println("Welcome to Email Application");
        System.out.println("----------------------------");
    }

    public static void thankYou() {
        System.out.println("Thank your for using the application");
    }

    public static void showChoice() {
        System.out.println("");
        System.out.println("-------Menu-------");
        System.out.println("1. Show Info");
        System.out.println("2. Change Password");
        System.out.println("3. Change Email Capacity");
        System.out.println("4. Set Alternate Email Capacity");
        System.out.println("5. Save to a file");
        System.out.println("6. Read from a file");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    public static String capitalize(String dept) {
        return dept.substring(0, 1).toUpperCase() + dept.substring(1);
    }
}
