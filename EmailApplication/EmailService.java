package EmailApplication;

public interface EmailService {

    void showUserInfo();

    void updatePassword();

    void updateMailCapacity();

    void setAlternateEmail();

    void register();

    void generatePassword(int length);

    void generateEmail();

    void saveToFile();

    void readFromFile();

}
