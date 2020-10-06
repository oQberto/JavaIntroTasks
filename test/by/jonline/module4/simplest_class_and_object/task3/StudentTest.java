package by.jonline.module4.simplest_class_and_object.task3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student[] students = new Student[10];

    @BeforeEach
    void setUp() throws SingletonException {
        students[0] = Student.getInstance(0, "Surname1", "Name1", "secondName1", 1, new int[]{9, 9, 10, 9, 10});
        students[1] = Student.getInstance(1, "Surname2", "Name2", "secondName2", 1, new int[]{9, 8, 10, 9, 10});
        students[2] = Student.getInstance(2, "Surname3", "Name3", "secondName3", 2, new int[]{9, 6, 10, 9, 10});
        students[3] = Student.getInstance(3, "Surname4", "Name4", "secondName4", 2, new int[]{9, 9, 10, 9, 10});
        students[4] = Student.getInstance(4, "Surname5", "Name5", "secondName5", 3, new int[]{9, 7, 10, 9, 10});
        students[5] = Student.getInstance(5, "Surname6", "Name6", "secondName6", 3, new int[]{9, 9, 10, 9, 10});
        students[6] = Student.getInstance(6, "Surname7", "Name7", "secondName7", 4, new int[]{9, 7, 10, 9, 10});
        students[7] = Student.getInstance(7, "Surname8", "Name8", "secondName8", 4, new int[]{9, 7, 10, 9, 10});
        students[8] = Student.getInstance(8, "Surname9", "Name9", "secondName9", 5, new int[]{9, 9, 10, 9, 10});
        students[9] = Student.getInstance(9, "Surname10", "Name10", "secondName10", 5, new int[]{9, 9, 10, 9, 10});
    }

    @Test
    void exemplaryStudent() {
        List<Student> extendsExemplaryStudents = new ArrayList<>();
        extendsExemplaryStudents.add(students[0]);
        extendsExemplaryStudents.add(students[3]);
        extendsExemplaryStudents.add(students[5]);
        extendsExemplaryStudents.add(students[8]);
        extendsExemplaryStudents.add(students[9]);

        assertEquals(extendsExemplaryStudents, Student.selectSmartStudents(students));
    }

    @AfterEach
    void tearDown() {
        for (Student student : students) {
            if (student.exemplaryStudent(student.getAcademicPerformance())) {
                System.out.println(student);
            }
        }
    }
}