import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Amazon {


    List<String> categoryNames = new ArrayList<>();

    public void showCategories() throws Exception {
        categoryNames.add("Shoe");
        categoryNames.add("Toys");
        System.out.println(categoryNames);
        Scanner sc = new Scanner(System.in);
        String userInputCategory = sc.next();
        if (userInputCategory.equals("Shoe")) {
            Shoe shoe = new Shoe();
            Shoe.shoeCategories();
        } else if (userInputCategory.equalsIgnoreCase("Toys")) {
            Toys toys = new Toys();
            Toys.toysCategories();
        } else {
            System.out.println("Invalid" );
        }
        System.out.println();
    }

}



