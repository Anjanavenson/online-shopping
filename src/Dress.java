import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Dress {
    static List<String> dressCategories = new ArrayList<>();


    public static void dressCategories(){
        dressCategories.add("Shirts");
        dressCategories.add("Pants");
        dressCategories.add("Saree");
        dressCategories.add("Chudithar");
        System.out.println(dressCategories);
        Scanner sc = new Scanner(System.in);
        String userDressCategories = sc.next();
        Payment payment=new Payment();
        Payment.setPaymentDetails();
        System.out.println();


    }

}
