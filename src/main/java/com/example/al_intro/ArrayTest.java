package com.example.al_intro;

import org.junit.Test;

import static com.example.al_intro.Array.insert;
import static com.example.al_intro.Array.isSorted;
import static junit.framework.TestCase.*;

public class ArrayTest {
    @Test
    public void testArray() {
        int[] array = new int[11];

        for (int i = 0; i < array.length-1; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
        assertTrue(isSorted(array));
    }

    @Test
    public void insertThreeButItsSorted() {
        int[] array = new int[]{1,3,9};

        int[] array2 = new int [array.length+1];

        array2 = insert(array, 7);

        for (int i = 0; i < array2.length-1; i++) {
            System.out.println(array2[i]);
        }

        assertTrue(isSorted(array2));
    }
    @Test
    public void insertThreeButIsNotSorted() {
        int[] array = new int[]{3,5,1};

        int[] array2 = new int [array.length+1];

        array2 = insert(array, 10);

        for (int i = 0; i < array2.length-1; i++) {
            System.out.println(array2[i]);
        }

        assertFalse(isSorted(array2));
    }

}
