import java.util.ArrayList;
import java.util.List;

public class Ocean{

    private static final int WIDTH = 10;
    private static final int WEIGHT = 10;

    private List<List<Square>> squares;
    // private List<Ship> ships;


    public Ocean() {
            squares = CreateEmptyBoard();     
        }

    private List<Square> CreateRow(int y){
        List<Square> Row = new ArrayList<Square>();
        for( int x=0; x<WIDTH; x++){
            Square square = new Square(x, y);
            Row.add(square);
            }
        return Row;
        }
    
        public List <List <Square>> CreateEmptyBoard(){
            List<List<Square>> Board = new ArrayList<List<Square>>(); 
            for( int y=0; y<WEIGHT; y++){
                List<Square> row =CreateRow(y);
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
                int [] element = square.getXY();            
                playingboard +="|" + element[0] + element[1];
            }
            playingboard += "|\n";
        }
        playingboard += "=====================\n";
        return playingboard;
    }
    }
