import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
            System.out.println("Please enter the string that you want to reverse:");

            String stringtoReverse = input.nextLine();

            for(int i = stringtoReverse.length(); i > 0; i--){
                System.out.print(stringtoReverse.charAt(i-1));
        
        }
    }
}
