public class Room {
    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Room(String roomName, boolean isOccupied, int beds) {

        this.isOccupied = isOccupied;
        this.roomName = roomName;
        this.beds = beds;
    }
    public Room(){

    }
    protected String roomName;
    protected int beds;
    protected double rate;
    protected boolean isOccupied;



}
