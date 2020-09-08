/*
Вычислить значение функции
 */
package by.jonline.module1.branching.task5;

public class FunctionValue {
    private static double finalValue;

    public static double calculateFunctionValue (int userInput) {

        if (userInput <= 3) finalValue = Math.pow(userInput, 2) - 3 * userInput + 9;
        else finalValue = 1 / (Math.pow(userInput, 3) + 6);

        return finalValue;
    }
}