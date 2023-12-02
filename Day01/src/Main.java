import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("G:\\Meine Ablage\\Programmieren\\AOC_2023\\Day01\\Part1_Input.txt"))) {
            String line;
            int sum = 0;
            String res;
            while ((line = reader.readLine()) != null) {
                StringBuilder sb = new StringBuilder();
                for(char c : line.toCharArray()) {
                    if (Character.isDigit(c)) {
                        sb.append(c);
                    }
                }
                System.out.println(line);
                res = sb.toString();
                int number1 = res.charAt(0) - '0';
                int number2 = res.charAt(res.length() - 1) - '0';
                int end = number1*10+number2;
                sum += end;
            }
            System.out.printf("Sum: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
