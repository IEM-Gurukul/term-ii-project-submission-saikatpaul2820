package model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int studentId;
    private String name;
    private String email;
    private List<String> registeredCourses;

    public Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.registeredCourses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<String> getRegisteredCourses() {
        return registeredCourses;
    }

    public void registerCourse(String courseId) throws Exception {
        if (registeredCourses.contains(courseId)) {
            throw new Exception("Student already registered for this course.");
        }
        registeredCourses.add(courseId);
    }

    public void dropCourse(String courseId) {
        registeredCourses.remove(courseId);
    }

    public void displayCourses() {
        if (registeredCourses.isEmpty()) {
            System.out.println("No courses registered.");
        } else {
            System.out.println("Registered Courses: " + registeredCourses);
        }
    }
}