/*
Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
 */

package by.jonline.module4.simplest_class_and_object.task1;

public class Test1 {
    private int firstInt;
    private int secondInt;

    public Test1(int firstInt, int secondInt) {
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    public int greaterImportance() {
        if (firstInt > secondInt) {
            return firstInt;
        } else {
            return secondInt;
        }
    }

    public int sumOfInts() {
        return firstInt + secondInt;
    }

    public int getFirstInt() {
        return firstInt;
    }

    public int getSecondInt() {
        return secondInt;
    }

    public void setFirstInt(int firstInt) {
        this.firstInt = firstInt;
    }

    public void setSecondInt(int secondInt) {
        this.secondInt = secondInt;
    }

    @Override
    public String toString() {
        return firstInt + " " + secondInt;
    }
}
