/*import java.io.Console;
import java.util.*;


public class ONP {

    static Stack stack = new Stack();

    public double suma = 0;
    public char bierz�cyZnak;

    public static void main(String[] args) {

        String napis = "";
        String dzia�anie = "";
        boolean znak = true; //czy znak jest liczb�

        System.out.println("Prosz� podaj ci�g.");
        Scanner input = new Scanner(System.in);
        napis = input.nextLine();
        napis = napis.replaceAll(" ", "");

        for (int i = 0; i < napis.length(); i++) {
            if (napis.charAt(i) == '+') {
                dzia�anie = String.valueOf('+');
                znak = false;
            } else if (napis.charAt(i) == '-') {
                dzia�anie = String.valueOf('-');
                znak = false;
            } else if (napis.charAt(i) == '*') {
                dzia�anie = String.valueOf('*');
                znak = false;
            }
        }

    }
}
*/