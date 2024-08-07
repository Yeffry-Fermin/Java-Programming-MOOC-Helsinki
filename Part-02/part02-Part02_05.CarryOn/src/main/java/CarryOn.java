
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Shall we carry on?");
            String action = scanner.nextLine();
            
            if(action.equals("no")) {
                break;
            }
        }
    }
}
