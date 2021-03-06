public class Square {
    private String state;
    private int x;
    private int y;
    
    public Square(int x, int y){
        this.state = "ocean";
        this.x = y;
        this.y = x;
    }
    
    
    public void makeShip(){
        if (this.state.equals("ocean")){
            this.state = "ship";
        }
    }

    public int[] getXY(){
        return new int[] {this.x, this.y};
    }
    
    public void makeNeighbor(){
        if (this.state.equals("ocean")){
            this.state = "neighbor";
        }
    }
    
    public void makeHit(){
        if (this.state.equals("ship")){
            this.state = "hit";
        } else if (this.state.equals("ocean") || this.state.equals("neighbor")) {
            this.state = "miss";
        }
    }
    
    public void makeSunk(){
        if (this.state.equals("hit")){
            this.state = "sunk";
        }
    }
    
    public void makeMissFromNeighbor(){
            this.state = "miss";
    }
    
    public boolean isNeigbor(){
        return this.state.equals("neighbor");
    }
    
    public boolean isShip(){
        return this.state.equals("ship");
    }
    public boolean isHit(){
        return this.state.equals("hit");
    }
    
    public boolean isSunk(){
        return this.state.equals("sunk");
    }
    
    public boolean isMiss(){
        return this.state.equals("miss");
    }

    public boolean isOcean(){
        return this.state.equals("ocean");
    }

    public String getState(){
        return this.state;
    }
    
    
    public String showStatusToOwner() {
        if (this.isShip()){
            return "■";
        } else if (this.isHit()){
            return "×";
        } else if (this.isSunk()){
            return "#";
        }else if (this.isMiss()){
            return "Ø";
        }
        else {
            return " ";
         
        }
    }

    public String showStatusToOponent() {
        if (this.isSunk()){
            return "#";
        } else if (this.isHit()){
            return "×";
        }else if (this.isMiss()){
            return "Ø";
        }
        else {
            return " ";
         
        }
    }
}