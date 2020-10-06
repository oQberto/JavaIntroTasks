/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.
 */

package by.jonline.module2.decomposition.task13;

import java.util.ArrayList;
import java.util.List;

public class Twins {
    int firstTwin;
    int secondTwin;

    public Twins(int firstTwin, int secondTwin) {
        this.firstTwin = firstTwin;
        this.secondTwin = secondTwin;
    }

    public static List<Twins> findTwins(int n) {
        List<Twins> twinsList = new ArrayList<>();

        if (n > 2) {
            for (int i = n; i <= n * 2; i++) {
                twinsList.add(new Twins(i, i + 2));
                if (i + 2 == n * 2) {
                    break;
                }
            }
        }
        printTwins(twinsList);

        return twinsList;
    }

    @Override
    public String toString() {
        return firstTwin + "<-->" + secondTwin + "; ";
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

        Twins other = (Twins) obj;
        if (firstTwin != other.firstTwin) {
            return false;
        }
        if (secondTwin != other.secondTwin) {
            return false;
        }
        return true;
    }

    private static <S> void printTwins(List<S> list) {
        for (S str : list) {
            System.out.print(str.toString());
        }
    }
}
