package Lab14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Lab14 {

    private static final String FILE_PATH = "F:\\навчання\\java\\All_lab\\src\\lab14\\file.txt";
    private static final String FILE_NOT_FOUND_MESSAGE = "Файл не знайдений";
    private static final String LINE_READ_MESSAGE = "Введений рядок: ";
    private static final String TOKENS_FOUND_MESSAGE = " Рядок складається з:";
    private static final String NUMBER_MESSAGE = " - це число = ";
    private static final String NOT_A_NUMBER_MESSAGE = " - не є числом";
    private static final String NEW_LINE = "\n";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(LINE_READ_MESSAGE + line);

                StringTokenizer tokenizer = new StringTokenizer(line);
                System.out.print(TOKENS_FOUND_MESSAGE);

                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    try {
                        double number = Double.parseDouble(token);
                        System.out.print(NEW_LINE + number + NUMBER_MESSAGE + number);
                    } catch (NumberFormatException e) {
                        System.out.print(NEW_LINE + token + NOT_A_NUMBER_MESSAGE);
                    }
                }
                System.out.println(NEW_LINE);
            }
        } catch (IOException e) {
            System.out.println(FILE_NOT_FOUND_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
