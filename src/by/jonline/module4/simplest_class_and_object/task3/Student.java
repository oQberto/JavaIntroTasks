/*
 Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

package by.jonline.module4.simplest_class_and_object.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Student {
    private String surname;
    private String name;
    private String secondName;
    private int groupNumber;
    private int[] academicPerformance;

    private static final int MAX_AVAILABLE = 10;
    private static final Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);
    private static final ArrayList<Student> instances = new ArrayList<>(MAX_AVAILABLE);

    public static List<Student> selectSmartStudents(Student[] students) {
        List<Student> exemplaryStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.exemplaryStudent(student.getAcademicPerformance())) {
                exemplaryStudents.add(student);
            }
        }
        return exemplaryStudents;
    }

    public boolean exemplaryStudent(int[] academicPerformance) {
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

    private Student() {
    }

    private Student(String surname, String name, String secondName, int groupNumber, int[] academicPerformance) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public static Student getInstance(int index, String surname, String name, String secondName, int groupNumber, int[] academicPerformance) throws SingletonException {
        if (index >= 0 && index < instances.size()) {
            return instances.get(index);
        }
        if (semaphore.tryAcquire()) {
            Student tmp = new Student(surname, name, secondName, groupNumber, academicPerformance);
            instances.add(tmp);
            return tmp;
        }
        throw new SingletonException("превышен лимит на число экземпляров.");
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    @Override
    public int hashCode() {
        int result = 31;

        result = 37 * result + (surname == null ? 0 : surname.hashCode());
        result = 37 * result + (name == null ? 0 : name.hashCode());
        result = 37 * result + (secondName == null ? 0 : secondName.hashCode());
        result = 37 * result + groupNumber;
        for (int i : academicPerformance) {
            result = 37 * result + i;
        }

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;
        if (!surname.equals(student.surname)) {
            return false;
        }
        if (!name.equals(student.name)) {
            return false;
        }
        if (!secondName.equals(student.secondName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Студент " + name + " из группы " + groupNumber + " учиться хорошо!";
    }
}
