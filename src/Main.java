import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String Username ="Anjana";
        String Password ="12345";
        String Username1;
        String Passcode;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username:");
        Username1 = input.nextLine();
        System.out.println("Enter your Passcode:");
        Passcode = input.nextLine();
        if(Username.equals(Username1)&&Password.equals(Passcode)){
            System.out.println("Login Succuessfull");
            Application application = new Application();
            application.showAplicationName();
        }
        else {
            System.out.println("Username/Password wrong");
        }
    }
}