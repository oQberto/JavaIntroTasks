/*
Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */

package by.jonline.module4.simplest_class_and_object.task6;

public class Clock {

    private final int[] clock = new int[3];

    public int[] setTime(int hours, int minutes, int seconds) {
        clock[0] = hours;
        checkHour(hours);

        clock[1] = minutes;
        checkMinutes(minutes);

        clock[2] = seconds;
        checkSeconds(seconds);

        return clock;
    }

    public int[] addHours(int hours) {
        int newHours;

        if ((newHours = clock[0] + hours) >= 24) {
            newHours = hours - (24 - clock[0]);
        }
        clock[0] = newHours;
        return clock;
    }

    public int[] addMinutes(int minutes) {
        int hoursInMinutes = (int) Math.floor(minutes / 60.0);
        addHours(hoursInMinutes);

        int intermediateMinutes = minutes - hoursInMinutes * 60;
        clock[1] = clock[1] + intermediateMinutes;

        return clock;
    }

    public int[] addSeconds(int seconds) {
        int minutesInSeconds = (int) Math.floor(seconds / 60.0);
        addMinutes(minutesInSeconds);

        int intermediateSeconds = seconds - minutesInSeconds * 60;
        clock[2] = clock[2] + intermediateSeconds;

        return clock;
    }

    public int[] setHours(int hours) {
        clock[0] = hours;
        checkHour(hours);
        return clock;
    }

    public int[] setMinutes(int minutes) {
        clock[1] = minutes;
        checkMinutes(minutes);
        return clock;
    }

    public int[] setSeconds(int seconds) {
        clock[2] = seconds;
        checkSeconds(seconds);
        return clock;
    }

    private int checkHour(int hour) {
        if (hour >= 24) {
            return 0;
        } else {
            return hour;
        }
    }

    private int checkMinutes(int minute) {
        if (minute >= 60) {
            return 0;
        } else {
            return minute;
        }
    }

    private int checkSeconds(int seconds) {
        if (seconds >= 24) {
            return 0;
        } else {
            return seconds;
        }
    }

    @Override
    public String toString() {
        String[] stringClock = new String[3];
        for (int i = 0; i < clock.length; i++) {
            if (clock[i] > 0 && clock[i] < 10) {
                stringClock[i] = "0" + clock[i];
            } else {
                stringClock[i] = Integer.toString(clock[i]);
            }
        }
        return stringClock[0] + " : " + stringClock[1] + " : " + stringClock[2];
    }
}