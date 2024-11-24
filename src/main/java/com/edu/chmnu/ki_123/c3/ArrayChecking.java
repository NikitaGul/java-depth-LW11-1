package com.edu.chmnu.ki_123.c3;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Builder
@Data
public class ArrayChecking {
    public final double[] array;

//    public ArrayChecking(double[] array) {
//        this.array = Arrays.copyOf(array, array.length);
//    }

    public List<Double> arrayWithoutDublicates() {
        List<Double> array2 = new ArrayList<>();

        for (double value : array) {
            if(!array2.contains(value)){
                array2.add(value);
            }
        }
        return array2;
    }
}
