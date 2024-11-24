package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCheckingTest {

    @Test
    void checkArrayNoHaveDublicates(){
        double array1[] = {1.0, 3.0, 3.6, 4.6, 5.7, 6.7, 4.6, 5.8, 5.6, 6.7};
        ArrayChecking array = new ArrayChecking(array1);

        List<Double> array2 = array.arrayWithoutDublicates();

        assertEquals(8, array2.size());
    }

    @Test
    void checkArrayWithoutOneDoublicates(){
        double array1[] = {1.0, 3.5, 3.6, 5.8, 5.7, 8.6};

        ArrayChecking array = new ArrayChecking(array1);

        List<Double> array2 = array.arrayWithoutDublicates();

        assertEquals(6, array2.size());
    }

    @Test
    void checkEmptyArray(){
        double[] array1 = {};

        ArrayChecking array = ArrayChecking.builder()
                .array(array1)
                .build();
        List<Double> array2 = array.arrayWithoutDublicates();

        assertEquals(0, array2.size());
    }

}