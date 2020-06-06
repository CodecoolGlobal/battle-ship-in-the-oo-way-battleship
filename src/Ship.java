import java.util.Arrays;
import java.util.List;


public class Ship {
    private List<List<Square>> board;
    private int lenght;
    public Ship(int lenght, List<List<Square>> board){
        lenght = this.lenght;
        board = this.board;
        showBoard();
    }

    private void showBoard(){
        board.toString();
    }
}