public class Player
{
    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    private Ship[] ships;
    private Grid own = new Grid();
    private Grid opp = new Grid();
    
    public Player() {
        ships = new Ship[SHIP_LENGTHS.length];
        for (int i = 0; i < SHIP_LENGTHS.length; i++) {
            ships[i] = new Ship(SHIP_LENGTHS[i]);
        }
    }
    
    public void printMyShips() {
        own.printShips();
    }
    
    public void printOpponentGuesses() {
        opp.printStatus();
    }
    
    public void printMyGuesses() {
        own.printStatus();
    }
    
    public void chooseShipLocation(Ship s, int row, int col, int direction) {
        s.setLocation(row, col);
        s.setDirection(direction);
        own.addShip(s);
    }
    
    public void recordOpponentGuess(int row, int col) {
        if (own.hasShip(row, col)) {
            opp.markHit(row, col);
        }
        else opp.markMiss(row, col);
    }
    
    
}
