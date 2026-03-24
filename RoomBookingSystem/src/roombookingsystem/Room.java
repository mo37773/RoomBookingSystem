package roombookingsystem;

public class Room {

    private int roomId;
    private int roomNumber;
    private int capacity;
    private String status;

    public Room(int roomId, int roomNumber, int capacity, String status) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.status = status;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
