package by.jonline.module4.simplest_class_and_object.task3;

import java.util.ArrayList;
import java.util.List;

public class StudentLogic {

    public static List<Student> selectSmartStudents(Student[] students) {
        List<Student> exemplaryStudents = new ArrayList<>();

        for (Student student : students) {
            if (exemplaryStudent(student.getAcademicPerformance())) {
                exemplaryStudents.add(student);
            }
        }
        return exemplaryStudents;
    }

    public static boolean exemplaryStudent(int[] academicPerformance) {
        boolean flag = false;
        for (int i : academicPerformance) {
            if (i >= 9) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
