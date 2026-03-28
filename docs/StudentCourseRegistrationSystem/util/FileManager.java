package util;

import model.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileManager {

    public static void saveStudents(Map<Integer, Student> students) {

        try {
            FileWriter writer = new FileWriter("students.txt");

            for (Student s : students.values()) {
                writer.write(s.getStudentId() + "," + s.getName() + "\n");
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}