import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guestList;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guestList = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(ArrayList<Guest> guestList) {
        this.guestList = guestList;
    }

    public int getGuestListSize(){
        return this.guestList.size();
    }

    public void addGuestToGuestList(Guest guest) {
        if (this.getGuestListSize() < this.capacity) {
            this.guestList.add(guest);
        }
    }

    public void removeGuestFromGuestList(Guest guest) {
        this.guestList.remove(guest);
    }



}
