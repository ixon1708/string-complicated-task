import java.io.*;
import java.util.Scanner;

public class StringBigTasks {
    public static void main(String[] args) throws IOException {
        /*
        считать содержимое файла можно при помощи потоков ввода/вывода,
        а можно использовать Scanner.
         */
        //первый вариант:
        File file = new File("in.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        double sum = 0;
        int errors = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            String[] parts = line.split(";");
            try {
                int index = Integer.parseInt(parts[0]);
                double resInLine = Double.parseDouble(parts[index]);
                sum += resInLine;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                errors++;
            }
        }
        System.out.println("Количество строк с ошибками: " + errors);
        System.out.println("Итоговая сумма: " + sum);
        //второй вариант чтения файла
        /*
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
         */
    }

}
