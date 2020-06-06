import java.util.Scanner;

public class Main {

    public static void main(String[] args) {       
        MainMenu menu = new MainMenu();
        Scanner scan = new Scanner(System.in);
        String answer = "";
        while(!answer.equals("q")){
            System.out.println(menu);
            answer = scan.next();
            if(answer.equals("1")){
                Player_vs_player playGame = new Player_vs_player();
            }
        }
        scan.close();

      }
  }
