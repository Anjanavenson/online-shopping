import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Mobile {
    static List<String> mobileCategories = new ArrayList<>();

    public static void mobileCategories() {

        mobileCategories.add("Apple");
        mobileCategories.add("Oneplus");
        mobileCategories.add("Redme");
        mobileCategories.add("oppo");
        System.out.println(mobileCategories);
        Scanner sc = new Scanner(System.in);
        String userMobileCategories = sc.next();
        Payment payment=new Payment();
        Payment.setPaymentDetails();
        System.out.println();


    }
}