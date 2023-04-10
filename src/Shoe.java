import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Shoe {
    static List<String> shoeCategories = new ArrayList<>();


    public static void shoeCategories() throws Exception {
        shoeCategories.add("Adidas");
        shoeCategories.add("nike");
        shoeCategories.add("mochi");
        shoeCategories.add("crocs");
        System.out.println(shoeCategories);
        Scanner sc = new Scanner(System.in);
        String userShoeCategories = sc.next();
        Payment payment=new Payment();
        Payment.setPaymentDetails();
        System.out.println();


    }

}
