import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vvodsclavy {
    public static void main(String args[]) throws IOException {
        int a = readInt();
        System.out.println(a);
    }

    public static int readInt() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        String s = "test";
        boolean isInt = false;
        int result = 0;
        while (isInt == false) {
            System.out.println("pls enter a number");
            s = reader.readLine();
            try {
                result = Integer.parseInt(s);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println("nice try");
            }
        }
        return result;

    }
}



