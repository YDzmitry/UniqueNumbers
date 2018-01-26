import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class UniqNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("INPUT.TXT"));
        PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
        Set<String> set = new LinkedHashSet<>();
        Integer value = scanner.nextInt();
        for (Integer i = 0; i <= value; i++, set.clear()) {
            for (int j = 0; j < i.toString().length(); j++) {
                set.add(String.valueOf(i.toString().charAt(j)));
            }
            if (set.size() != i.toString().length()) {
                value++;
            }
            set.clear();
        }
        pw.print(value);
        pw.close();
    }
}