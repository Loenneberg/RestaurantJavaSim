public class Table {
    private int number;
    private int capacity;
    private boolean isBooked;


    // Konstruktor
    public Table(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.isBooked = false;
    }

    public int getNumber() {
        return number;
    }
    public int getCapacity() {
        return capacity;
    }
    public boolean isBooked() {
        return isBooked;
    }
    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
