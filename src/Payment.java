import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Payment {
    static List<String> paymentDetails = new ArrayList<>();
    public static void setPaymentDetails() throws Exception{
        Scanner sc =new Scanner(System.in);
        paymentDetails.add("UPI");
        paymentDetails.add("Net Banking");
        paymentDetails.add("COD");
        System.out.println(paymentDetails);
        String userInputCategory = sc.next();
        if (userInputCategory.equals("UPI")) {
            System.out.println("order placed");
        } else if (userInputCategory.equals("Net Banking")) {
            System.out.println("Order Placed");
        } else if (userInputCategory.equals("COD")){
            System.out.println("Order Placed");
        }else{
            throw new Exception("Payment method not matched");
        }

    }

}