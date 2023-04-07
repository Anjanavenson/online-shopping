import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    List<String> applicationName = new ArrayList<>();


    public void showAplicationName() throws Exception {
        applicationName.add("Flipkart");
        applicationName.add("Amazon");
        System.out.println(applicationName);
        Scanner sc = new Scanner(System.in);
        String applicationNameUserInput = sc.next();

        if(applicationNameUserInput.equals("Flipkart")){
            Flipkart flipkart = new Flipkart();
            flipkart.showCategories();
        }
        else if(applicationNameUserInput.equals("Amazon")){
            Amazon amazon = new Amazon();
            amazon.showCategories();
        }
        else{
            throw new Exception("we don't have a app like that");
        }

        System.out.println();


    }
}
