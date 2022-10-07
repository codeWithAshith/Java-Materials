package EmailApplication;

import java.util.Scanner;

public class Email {
    private String fName;
    private String lName;
    private String dept;
    private String email;
    private String password;
    private String alternateEmail;
    private int mailCapacity = 500;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailCapacity() {
        return mailCapacity;
    }

    public void setMailCapacity(int mailCapacity) {
        this.mailCapacity = mailCapacity;
    }
}
