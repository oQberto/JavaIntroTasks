/*
Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

package by.jonline.module4.simplest_class_and_object.task5;

public class Counter {
    private int minValue;
    private int maxValue;
    private int currentState;

    public Counter() {
    }

    public Counter(int minValue, int maxValue, int currentState) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currentState = currentState;

        if (this.maxValue < this.minValue) {
            int temp = this.maxValue;
            this.maxValue = this.minValue;
            this.minValue = temp;
        }
    }

    public int setDefaultSettings(String userInput) {
        String defaultSettings = "Default settings";
        int DEFAULT_SETTINGS = maxValue / 2;

        if (userInput.equals(defaultSettings)) {
            currentState = DEFAULT_SETTINGS;
        }
        return currentState;
    }

    public int increaseCounter() {
        currentState++;
        if (currentState > maxValue) {
            currentState = maxValue;
        }
        return currentState;
    }

    public int decreaseCounter() {
        currentState--;
        if (currentState < minValue) {
            currentState = minValue;
        }
        return currentState;
    }

    public String checkTheCurrentState() {
        return "Текущее состояние счетчика: " + currentState;
    }

}