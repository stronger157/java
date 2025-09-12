class Student {
    private String name;
    private int rollNumber;
    private int marks;

    // Getter & Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter & Setter for marks
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Set values using setters
        s1.setName("Alice");
        s1.setRollNumber(1);
        s1.setMarks(85);

        s2.setName("Bob");
        s2.setRollNumber(2);
        s2.setMarks(90);

        s3.setName("Charlie");
        s3.setRollNumber(3);
        s3.setMarks(78);

        // Display details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
