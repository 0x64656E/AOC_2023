import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        part1();
        part2();
    }

    public static void part1(){
        try (BufferedReader reader = new BufferedReader(new FileReader("G:\\Meine Ablage\\Programmieren\\AOC_2023\\Day02\\src\\Day02_Input.txt"))) {
            String line;
            int sum = 0;
            int i = 1;

            while ((line = reader.readLine()) != null) {
                String[] splitGame = line.split(":");
                String[] games = splitGame[1].split(";");
                int countRed = 0;
                int countGreen = 0;
                int countBlue = 0;
                for (String s : games) {
                    String[] game = s.split(",");
                    for (String value : game) {
                        String[] color = value.split(" ");
                        switch (color[2]) {
                            case "red" -> {
                                if (countRed < Integer.parseInt(color[1]))
                                    countRed = Integer.parseInt(color[1]);
                            }
                            case "blue" -> {
                                if (countBlue < Integer.parseInt(color[1]))
                                    countBlue = Integer.parseInt(color[1]);
                            }
                            case "green" -> {
                                if (countGreen < Integer.parseInt(color[1]))
                                    countGreen = Integer.parseInt(color[1]);
                            }
                        }
                    }
                }
                if(countRed <= 12 && countGreen <= 13 && countBlue <= 14) {
                    sum += i;
                }
                i++;
            }
            System.out.printf("Sum: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void part2(){
        try (BufferedReader reader = new BufferedReader(new FileReader("G:\\Meine Ablage\\Programmieren\\AOC_2023\\Day02\\src\\Day02_Input.txt"))) {
            String line;
            int sum = 0;

            while ((line = reader.readLine()) != null) {
                String[] splitGame = line.split(":");
                String[] games = splitGame[1].split(";");
                int countRed = 0;
                int countGreen = 0;
                int countBlue = 0;
                for (String s : games) {
                    String[] game = s.split(",");
                    for (String value : game) {
                        String[] color = value.split(" ");
                        if (color[2].equals("red")) {
                            if (countRed < Integer.parseInt(color[1]))
                                countRed = Integer.parseInt(color[1]);
                        } else if (color[2].equals("blue")) {
                            if (countBlue < Integer.parseInt(color[1]))
                                countBlue = Integer.parseInt(color[1]);
                        } else if (color[2].equals("green")) {
                            if (countGreen < Integer.parseInt(color[1]))
                                countGreen = Integer.parseInt(color[1]);
                        }
                    }
                }
                sum += (countRed * countGreen * countBlue);
            }
            System.out.printf("Sum: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}