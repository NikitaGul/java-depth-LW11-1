package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

        import java.util.Arrays;
import java.util.List;

public class Main {
            public static void main(String[] args) {

                double[] array1 = {2.4, 2.5, 4.6, 5.8, 3.5, 3.7, 7.5, 3.8, 5.7, 5.8};

                ArrayChecking array = ArrayChecking.builder()
                                .array(array1)
                                .build();

                List<Double> array2 = array.arrayWithoutDublicates();

                System.out.println(array2.toString());
            }
        }
