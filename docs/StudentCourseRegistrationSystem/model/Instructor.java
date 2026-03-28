package model;

public class Instructor {

    private int instructorId;
    private String name;
    private String department;

    public Instructor(int instructorId, String name, String department) {
        this.instructorId = instructorId;
        this.name = name;
        this.department = department;
    }

    public void displayInstructor() {
        System.out.println("Instructor: " + name + " | Department: " + department);
    }
}