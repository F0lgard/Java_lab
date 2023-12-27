package lab9;

import java.util.*;

class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}

public class lab9 {
    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Іван", 1));
        studentList.add(new Student("Петро", 2));
        studentList.add(new Student("Марія", 1));
        studentList.add(new Student("Олена", 3));
        studentList.add(new Student("Олег", 2));
        studentList.add(new Student("Анна", 1));
        studentList.add(new Student("Ірина", 2));
        studentList.add(new Student("Максим", 3));
        studentList.add(new Student("Олексій", 1));
        studentList.add(new Student("Наталія", 2));

        int targetCourse = 2;
        System.out.println("Студенти на " + targetCourse + " курсі:");
        printStudents(studentList, targetCourse);
    }
}
