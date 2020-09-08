/*
Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
HHч MMмин SSс
 */
package by.jonline.module1.linear_program.task5;

public class Task5 {
    static long hour;
    static long minutes;
    static long sec;
    public static String calculateTime (long seconds) {

        hour = seconds / 3600;
        minutes = seconds / 60 % 60;
        sec = seconds % 60;

        return String.format("%02d:%02d:%02d", hour, minutes, sec);
    }
}
