package roombookingsystem;

public class Room {
    private int roomId;
    private String roomNumber;
    private int capacity;
    private String status;

    public Room(int roomId, String roomNumber, int capacity, String status) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.status = status;
    }

    public int getRoomId() { return roomId; }
    public String getRoomNumber() { return roomNumber; }
    public int getCapacity() { return capacity; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
}
