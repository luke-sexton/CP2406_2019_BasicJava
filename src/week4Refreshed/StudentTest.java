package week4Refreshed;

import org.junit.jupiter.api.Test;

class StudentTest {
    @Test
    void basicTest() {
        Student student = new Student(1, 10, 100);

        int id = student.getId();
        double creditHours = student.getCreditHours();
        double pointsEarned = student.getPointsEarned();

        System.out.println("-- Student --");
        System.out.println(id);
        System.out.println(creditHours);
        System.out.println(pointsEarned);
    }

    @Test
    void checkGPA() {
        Student student = new Student(2, 5, 10);

        double gpa = student.calculateGpa();
        System.out.println("-- Calculate GPA --");
        System.out.println(gpa);
    }

    @Test
    void initialiser() {
        Student student = new Student();

        int id = student.getId();
        double creditHours = student.getCreditHours();
        double pointsEarned = student.getPointsEarned();
        System.out.println("-- Initialiser --");
        System.out.println(id);
        System.out.println(creditHours);
        System.out.println(pointsEarned);

    }
}