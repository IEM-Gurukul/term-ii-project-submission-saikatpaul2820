package main;

import model.Student;
import model.Course;
import service.EnrollmentManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EnrollmentManager manager = new EnrollmentManager();

        while (true) {

            System.out.println("\n==== Student Course Registration System ====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Register Course");
            System.out.println("4. Drop Course");
            System.out.println("5. View Student Courses");
            System.out.println("6. View All Courses");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    manager.addStudent(new Student(id, name, email));
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Course ID: ");
                    String cid = sc.nextLine();

                    System.out.print("Course Name: ");
                    String cname = sc.nextLine();

                    System.out.print("Instructor: ");
                    String instructor = sc.nextLine();

                    manager.addCourse(new Course(cid, cname, instructor));
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Course ID: ");
                    String courseId = sc.nextLine();

                    manager.registerCourse(sid, courseId);
                    break;

                case 4:
                    System.out.print("Student ID: ");
                    int sId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Course ID: ");
                    String cId = sc.nextLine();

                    manager.dropCourse(sId, cId);
                    break;

                case 5:
                    System.out.print("Student ID: ");
                    int studentId = sc.nextInt();

                    manager.displayStudentCourses(studentId);
                    break;

                case 6:
                    manager.displayAllCourses();
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
}