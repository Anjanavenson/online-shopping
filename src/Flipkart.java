import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flipkart {


    List<String> categoryNames = new ArrayList<>();

    public void showCategories() throws Exception {
        categoryNames.add("dress");
        categoryNames.add("mobile");
        System.out.println(categoryNames);
        Scanner sc = new Scanner(System.in);
        String userInputCategory = sc.next();
        if (userInputCategory.equalsIgnoreCase("dress")) {
            Dress dress = new Dress();
            Dress.dressCategories();
        } else if (userInputCategory.equalsIgnoreCase("mobile")) {
            Mobile mobile = new Mobile();
            Mobile.mobileCategories();
        } else {
            System.out.println("Invalid" );
        }
        System.out.println();
    }
}