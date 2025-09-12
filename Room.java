// WAP to create a Room class with attributes and methods

class Room {
   
    private int roomno;
    private String roomtype;
    private double roomarea;
    private boolean ACmachine;

   
    public void setData(int roomno, String roomtype, double roomarea, boolean ACmachine) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }

  
    public void displayData() {
        System.out.println("Room No: " + roomno);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Room Area: " + roomarea + " sq.ft");
        System.out.println("AC Available: " + (ACmachine ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        
        Room r1 = new Room();

        
        r1.setData(101, "Deluxe", 250.5, true);

        
        r1.displayData();
    }
}
