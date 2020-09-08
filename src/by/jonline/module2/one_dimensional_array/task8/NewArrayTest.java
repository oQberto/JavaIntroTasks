package by.jonline.module2.one_dimensional_array.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewArrayTest {

    @Test
    void createANewArrayWhenThereIsOneMinimumValue () {
        assertEquals("[1, 2, 3, 4]", NewArray.creatingANewArray(new int[]{1, -2, 2, 3, 4}));
    }

    @Test
    void createANewArrayWhenThereAreTwoIdenticalMinimumValues () {
        assertEquals("[1, 2, 3]", NewArray.creatingANewArray(new int[]{1, -2, 2, 3, -2}));
    }

}