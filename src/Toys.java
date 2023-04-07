import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Toys {
    static List<String> toysCategories = new ArrayList<>();


    public static void toysCategories(){
        toysCategories.add("Unicorn");
        toysCategories.add("Panda");
        toysCategories.add("Teddy");
        toysCategories.add("Dog");
        System.out.println(toysCategories);
        Scanner sc = new Scanner(System.in);
        String userToysCategories = sc.next();
        System.out.println();
        Payment payment=new Payment();
        Payment.setPaymentDetails();

    }

}
