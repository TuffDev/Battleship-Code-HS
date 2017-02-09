public class Location
{
   public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    
    private boolean hasShip;
    private int status;
    // Location constructor. 
public Location(){
    status = 0;
}

// Was this Location a hit?
public boolean checkHit() {
    if (status == 1) {
        return true;
    }
    return false;
}

// Was this location a miss?
public boolean checkMiss() {
    if (status == 2 ) {
        return true;
    }
    return false;
}

// Was this location unguessed?
public boolean isUnguessed() {
    if (status == 0) {
        return true;
    }
    else return false;
}

// Mark this location a hit.
public void markHit() {
    status = 1;
}

// Mark this location a miss.
public void markMiss() {
    status = 2;
}

// Return whether or not this location has a ship.
public boolean hasShip() {
    if (hasShip == true) {
        return true;
    }
    return false;
}

// Set the value of whether this location has a ship.
public void setShip(boolean val) {
    hasShip = true;
}

// Set the status of this Location.
public void setStatus(int status) {
    this.status = status;
}

// Get the status of this Location.
public int getStatus(){
    return status;
}

}
