package service;

import model.Student;
import model.Course;

import java.util.HashMap;
import java.util.Map;

public class EnrollmentManager {

    private Map<Integer, Student> students;
    private Map<String, Course> courses;

    public EnrollmentManager() {
        students = new HashMap<>();
        courses = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public void addCourse(Course course) {
        courses.put(course.getCourseId(), course);
    }

    public void registerCourse(int studentId, String courseId) {
        try {
            Student student = students.get(studentId);

            if (student == null) {
                System.out.println("Student not found.");
                return;
            }

            if (!courses.containsKey(courseId)) {
                System.out.println("Course not found.");
                return;
            }

            student.registerCourse(courseId);
            System.out.println("Course registered successfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void dropCourse(int studentId, String courseId) {

        Student student = students.get(studentId);

        if (student != null) {
            student.dropCourse(courseId);
            System.out.println("Course dropped.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudentCourses(int studentId) {

        Student student = students.get(studentId);

        if (student != null) {
            student.displayCourses();
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayAllCourses() {
        for (Course c : courses.values()) {
            c.displayCourse();
        }
    }
}