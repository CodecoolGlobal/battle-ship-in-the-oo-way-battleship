import java.util.Arrays;
import java.util.List;


public class Ship {
    Square[] shipPlace;
    List<Square> shipNeighbor;
    boolean sunk;

    public Ship(Square[] shipPlace){
        this.sunk = false;
        this.shipPlace = shipPlace;
        for (int i = 0; i < shipPlace.length; i++){
            shipPlace[i].makeShip();
        }
    }
    public Square[] getPosition(){
        return this.shipPlace;
    }

    public void addNeighbors(List<Square> neighbor){
        this.shipNeighbor = neighbor;
        for (int i = 0; i < this.shipNeighbor.size(); i++){
            shipNeighbor.get(i).makeNeighbor();
        }
    }

    public void updateState(){
        this.sunk = true;
        for (Square s: this.shipPlace){
            if (s.isShip()){
                this.sunk = false;
            }
        }
        if (this.sunk){
            for (int j = 0; j < this.shipPlace.length; j++){
                this.shipPlace[j].makeSunk();
            }
            for (int i = 0; i < this.shipNeighbor.size(); i++){
                this.shipNeighbor.get(i).makeMissFromNeighbor();
            }
    }}

    public boolean isSunk(){
        return this.sunk;
    }

    public boolean checkIfLocationIsPartoOfShip(Square location){
        return Arrays.asList(this.shipPlace).contains(location);
    }

    public boolean tryToHitLocation(Square location){
        boolean isHit = checkIfLocationIsPartoOfShip(location);
        if (isHit){
            location.makeHit();
            this.updateState();
        }
        return isHit;
    }
