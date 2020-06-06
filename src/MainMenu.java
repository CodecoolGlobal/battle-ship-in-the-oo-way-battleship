public class MainMenu {
    private String [] menu = {"PLAYER VS PLAYER (1)" , "PLAYER VS AI (2)", "EXIT (q)"};

    public MainMenu(){
    }
    @Override
    public String toString() {
        int index = 1;
        String menuOptions;
        menuOptions = ("BATTLESHIP\n\n");
        for (String text: menu){
        menuOptions += index + " " + text;
        menuOptions += "\n";
        }
        return menuOptions;
    }
}