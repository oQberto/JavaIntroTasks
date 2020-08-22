/*
Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
HHч MMмин SSс
 */
package basicsOfSoftwareCodeDevelopment.linearPrograms.Task5;

public class Task5 {
    public static String calculateTime (long seconds) {
        long hour = seconds / 3600;
        long minutes = seconds / 60 % 60;
        long sec = seconds % 60;
        return String.format("%02d:%02d:%02d", hour, minutes, sec);
    }
}
