import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManagement {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    public void searchStudentById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                System.out.println("Student found: " + s);
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }

    public void deleteStudentById(int id) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId() == id) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }
}
