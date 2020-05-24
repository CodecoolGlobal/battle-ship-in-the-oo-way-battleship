import java.util.ArrayList;
import java.util.List;

public class Ocean{

    private static final int WIDTH = 10;
    private static final int WEIGHT = 10;

    private List<List<Square>> squares;
    private List<Ship> ships;


    public Ocean() {
            squares = CreateEmptyBoard();     
        }

    private List<Square> CreateRow(){
        List<Square> Row = new ArrayList<Square>();
        for( int i=0; i<WIDTH; i++){
            Square square = new Square();
            Row.add(square);
            }
        return Row;
        }
    
        public List <List <Square>> CreateEmptyBoard(){
            List<List<Square>> Board = new ArrayList<List<Square>>(); 
            for( int i=0; i<WEIGHT; i++){
                List<Square> row =CreateRow();
                Board.add(row);
            }
        return Board;
        }
    

    @Override
    public String toString() {
        String playingboard = "";
        for(List<Square> row : squares){
            playingboard += "=====================\n";
            for(Square square : row){
                String element = String.valueOf(square);
                playingboard +="|" + element;
            }
            playingboard += "|\n";
        }
        playingboard += "=====================\n";
        return playingboard;
    }
    }
