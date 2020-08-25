/*
Дано действительное число R вида nnn.ddd (три цифровых рахряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
package basicsOfSoftwareCodeDevelopment.linearPrograms.Task4;

import java.util.concurrent.TimeUnit;

public class Task4 {
    public static double reverseNum (double number) {
        String num2Str = Double.toString(number);

        return Double.parseDouble(new StringBuffer(num2Str).reverse().toString());
    }
}