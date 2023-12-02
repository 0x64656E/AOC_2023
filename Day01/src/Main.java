import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[]args){
        part1();
        part2();
    }
    public static void part1(){
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
    public static void part2() {
        final Map<String, String> wordToNumber = new HashMap<>();
         {
            wordToNumber.put("one", "o1e");
            wordToNumber.put("two", "t2o");
            wordToNumber.put("three", "t3e");
            wordToNumber.put("four", "f4r");
            wordToNumber.put("five", "f5e");
            wordToNumber.put("six", "s6x");
            wordToNumber.put("seven", "s7n");
            wordToNumber.put("eight", "e8t");
            wordToNumber.put("nine", "n9e");
        }
            try (BufferedReader reader = new BufferedReader(new FileReader("G:\\Meine Ablage\\Programmieren\\AOC_2023\\Day01\\Part1_Input.txt"))) {
                String line;
                int sum = 0;
                String res;
                while ((line = reader.readLine()) != null) {
                    for (Map.Entry<String, String> entry : wordToNumber.entrySet()) {
                        line = line.replace(entry.getKey(), entry.getValue());
                    }
                    StringBuilder sb = new StringBuilder();
                    for (char c : line.toCharArray()) {
                        if (Character.isDigit(c)) {
                            sb.append(c);
                        }
                    }
                    res = sb.toString();
                    int number1 = res.charAt(0) - '0';
                    int number2 = res.charAt(res.length() - 1) - '0';
                    int end = number1 * 10 + number2;
                    sum += end;
                }
                System.out.printf("Sum: " + sum);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
