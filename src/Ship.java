package battleship;
import java.util.List;

public class Ship {
    

    private List<Square> squares;

    public Ship(List<Square> squares){
        this.squares = squares
    }

    @Override
    public String toString(){
        return "";
    }
}