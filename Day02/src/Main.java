import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        part1();
    }

    public static void part1(){
        try (BufferedReader reader = new BufferedReader(new FileReader("G:\\Meine Ablage\\Programmieren\\AOC_2023\\Day02\\src\\Day02_Input.txt"))) {
            String line;
            int sum = 0;
            int i = 1;
            int n = 0;
            boolean checkGame = false;
            boolean checkGamePart = false;
            while ((line = reader.readLine()) != null) {
                String[] splitGame = line.split(":");
                String[] games = splitGame[1].split(";");
                for(int k = 0; k < games.length;k++){
                    n = 0;
                    String[] game = games[k].split(",");
                    for(int j = 0; j < game.length; j++){
                        String[] color = game[j].split(" ");
                        if(color[2].equals("red")){
                            if(Integer.parseInt(color[1]) <= 12){
                                n++;
                            }
                        } else if(color[2].equals("blue")){
                            if(Integer.parseInt(color[1]) <= 14){
                                n++;
                            }
                        }else if(color[2].equals("green")){
                            if(Integer.parseInt(color[1]) <= 13){
                                n++;
                            }
                        }
                        if(n == 3){
                            checkGame = true;
                        }
                    }
                }
                if(checkGame) {
                    sum += i;
                }
                i++;
            }
            System.out.printf("Sum: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}