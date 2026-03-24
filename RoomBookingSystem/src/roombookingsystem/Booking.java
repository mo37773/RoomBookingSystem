package roombookingsystem;

public class Booking {
    private int bookingId;
    private String studentName;
    private String studentID;
    private int roomId;
    private String date;
    private String startTime;
    private String endTime;
    private String status;

    public Booking(int bookingId, String studentName, String studentID,
                   int roomId, String date, String startTime, String endTime, String status) {
        this.bookingId = bookingId;
        this.studentName = studentName;
        this.studentID = studentID;
        this.roomId = roomId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public int getBookingId() { return bookingId; }
    public String getStudentName() { return studentName; }
    public String getStudentID() { return studentID; }
    public int getRoomId() { return roomId; }
    public String getDate() { return date; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
