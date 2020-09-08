/*
Даны целые числа а1 ,а2 ,..., аn.
Вывести на печать только те числа, для которых аi > i.
 */
package by.jonline.module2.one_dimensional_array.task5;

public class OutputNumbers {
    public static void printArrayNumbers (int[] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] > i) System.out.print(userArray[i] + " ");
        }
    }
}