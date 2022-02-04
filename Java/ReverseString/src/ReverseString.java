import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String original = "";
        String reversed = "";

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string to be reversed");

            if (sc.hasNextLine()) {
                original = sc.nextLine();
            }

            System.out.println("You entered: " + original);

            for (int i = original.length() - 1; i >= 0; i--) {
                reversed += (original.charAt(i));
            }

            System.out.println("The reverse of " + original + " is: " + reversed);

            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}