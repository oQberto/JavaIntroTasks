package by.jonline.module2.one_dimensional_array.task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressedArrayTest {

    @Test
    void compressedTheArrayByDiscardingEverySecondElementWhenTheArrayIsOdd () {
        assertEquals("[3, 2, 6, 4, 0, 0, 0]", CompressedArray.compressedTheArrayByDiscardingEverySecondElement(new int[]{3, 1, 2, 5, 6, 7, 4}));
    }

    @Test
    void compressedTheArrayByDiscardingEverySecondElementWhenTheArrayIsEven () {
        assertEquals("[3, 2, 6, 4, 0, 0, 0, 0]", CompressedArray.compressedTheArrayByDiscardingEverySecondElement(new int[]{3, 1, 2, 5, 6, 7, 4, 5}));
    }

    @Test
    void compressedTheArrayByDiscardingEverySecondElementWhenThereIsOneElementInTheArray () {
        assertEquals("[3]", CompressedArray.compressedTheArrayByDiscardingEverySecondElement(new int[]{3}));
    }
}