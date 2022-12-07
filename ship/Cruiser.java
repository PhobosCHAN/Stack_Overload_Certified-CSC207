package ship;

import model.BattlePoint;

/** A cruiser ship.
 */
public class Cruiser implements Ship {

    /**
     * Cruiser Ship.
     * A ship with length 4.
     */
    BattlePoint[] body;
    public boolean vertical = true;

    private int health;

    /**
     * Constructor for a Cruiser Ship.
     *
     * @param body    a list of BattlePoints.
     * @param vertical    boolean value for the orientation of the ship.
     */
    public Cruiser(BattlePoint[] body, boolean vertical){
        this.body = body;
        this.health = 4;
        this.vertical = vertical;
    }
    public Cruiser(){
        this.health = 4;
    }

    /**
     * Getter for ship HP
     */
    public int getHP(){
        return this.health;
    }

    /**
     * Getter for ship Body
     */
    public BattlePoint[] getBody() {
        return this.body;
    }

    /**
     * Deducts the ship health by 1 since it's been hit.
     */
    public void hit() {
        health--;
    }

    /**
     * Returns true if the ship's health is more than 0 and the ship is alive.
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * Getter for ship Vertical
     */
    public boolean getVertical(){
        return this.vertical;
    }

    /**
     * Setter for ship's body based on its orientation(vertical or horizontal) and
     * the placement of the origin of the ship on the board(given by x and y).
     */
    public void setBody(boolean vert, int x, int y) {
        body = new BattlePoint[4];
        for(int i = 0; i < 4; i++){
            if(vert) {
                BattlePoint battlePoint = new BattlePoint(x, y);
                body[i] = battlePoint;
                y--;
            }
            else{
                BattlePoint battlePoint = new BattlePoint(x, y);
                body[i] = battlePoint;
                x++;
            }
        }
    }

    /**
     * Setter for ship Vertical
     */
    @Override
    public void setVertical(boolean vert) {
        this.vertical = vert;
    }
}
